package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552___c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int a = 0;
        int b = 0;

        for (int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
