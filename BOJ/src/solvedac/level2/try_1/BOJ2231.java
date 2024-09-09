package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String strN = String.valueOf(N);
        int numlen = strN.length();

        int ans = 0;
        for (int i=N-1; i>=0; i--) {
            int sum = 0;
            String str = String.valueOf(i);
            sum += i;
            for (int j=0; j<str.length(); j++) {
                int a = str.charAt(j) - '0';
                sum += a;
            }

            if (sum == N) {
                ans = i;
            }
        }
        System.out.println(ans);

    }
}
