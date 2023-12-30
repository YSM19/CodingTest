package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] num_list = new int[5];
        for (int i=0; i<num_list.length; i++) {
            num_list[i] += Integer.parseInt(st.nextToken());
            if(n==num_list[i]){
                cnt++;
            }

        }

        br.close();
        bw.write(cnt+"");
        bw.flush();
        bw.close();

    }
}
