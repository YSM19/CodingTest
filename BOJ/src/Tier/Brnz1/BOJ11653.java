package Tier.Brnz1;

import java.io.*;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 2;

        while (true) {
            if (n == 1) break;

            if (n%cnt==0) {
                System.out.println(cnt);
                n= n/cnt;
            }
            else if (n%cnt!=0) cnt++;
        }
    }
}
