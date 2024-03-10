package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String str = "";
        String ans = "";
        for (int i=0; i<n; i++) {
            str = br.readLine();

            for (int j = m - 1; j > -1; j--) {
                bw.write(str.charAt(j));
            }
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
