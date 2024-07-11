package Tier.Brnz2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ8958_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str;
        StringTokenizer st;

        int cnt = 0;

        for (int i=0; i<n; i++) {
            str = br.readLine();

            cnt = 0;
            st = new StringTokenizer(str, "X");
            while (st.hasMoreTokens()) {
                int num = 0;

                String str2 = st.nextToken();
                num = str2.length();
                cnt += num * (num+1) / 2;
            }
            System.out.println(cnt);
        }

    }
}
