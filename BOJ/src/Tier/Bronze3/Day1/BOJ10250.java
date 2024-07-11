package Tier.Bronze3.Day1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int x = (N/H) + 1;
            int y = N%H;

            if (N%H==0) {
                x = N/H;
                y = H;
            }

            System.out.println(y*100+x);

        }
    }
}
