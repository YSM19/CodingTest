package Tier.Brnz1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n > m) {
            for (int i = m; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    System.out.println(i);
                    System.out.println(i * (m / i) * (n / i));
                    break;
                }
            }
        } else {
            for (int i = n; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    System.out.println(i);
                    System.out.println(i * (m / i) * (n / i));
                    break;
                }
            }
        }
    }
}