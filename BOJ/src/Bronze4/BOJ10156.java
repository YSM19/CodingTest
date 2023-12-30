package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int answer = 0;

        answer = k*n-m;
        if(answer<0){
            answer = 0;
        }

        br.close();
        bw.write( answer+ "");
        bw.flush();
        bw.close();

    }
}
