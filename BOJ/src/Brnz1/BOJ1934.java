package Brnz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a>b) {
                int temp = a;
                a = b;
                b = temp;
            }

            int cnt = a;
            int num = 1;

            while (true) {
//                if (a == 1 || b == 1) break;
//                if (cnt == 1) break;

                if (a % cnt == 0 && b % cnt == 0) {
                    a /= cnt;
                    b /= cnt;
                    break;
//                    num *= cnt;
                } else cnt--;
            }

            int ans = a * b * cnt;

            System.out.println(ans);

        }


    }
}
