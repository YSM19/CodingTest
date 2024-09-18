package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        dp[0] = 0; dp[1] = 1; dp[2] = 1; dp[3] = 1;

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n < 4) {
                System.out.println(dp[n]);
                continue;
            }

            for (int i=4; i<=n; i++) {
                dp[i] = dp[i-2] + dp[i-3];
            }
            System.out.println(dp[n]);
        }
    }
}
