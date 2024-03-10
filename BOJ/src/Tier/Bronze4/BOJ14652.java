package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(k== cnt){
                    bw.write(i+" "+j);
                    bw.flush();
                }
                cnt++;
            }
        }
        bw.close();
    }
}
