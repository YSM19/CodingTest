package Tier.Bronze4;

import java.io.*;

public class BOJ24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 1;

        for (int i=1; i<n+1; i++){
            ans *= 2;
        }

        bw.write(ans+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
