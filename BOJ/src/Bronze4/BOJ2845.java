package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1, st2;
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st1.nextToken());
        int p = Integer.parseInt(st1.nextToken());

        String answer = "";

        int[] num_list = new int[5];
        for (int i=0; i<5; i++){
            num_list[i] = Integer.parseInt(st2.nextToken());
            answer += (num_list[i] - l*p) + " ";
        }

        br.close();
        bw.write(answer+"");
        bw.flush();
        bw.close();


    }
}
