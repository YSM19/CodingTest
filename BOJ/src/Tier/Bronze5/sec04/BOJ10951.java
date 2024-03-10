package Tier.Bronze5.sec04;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while ((s= br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = a + b;

            bw.write(""+ans);
            bw.flush();
        }
    }
}
