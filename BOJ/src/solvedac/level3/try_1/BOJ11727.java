package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[1001];
        dp[1] = 1; dp[2] = 3; dp[3] = 5;
        for(int i = 4; i<=n; i++) {
            if(n < 4) {
                System.out.println(dp[n]);
                continue;
            }
            dp[i] = dp[i-1] + dp[i-2] * 2;
        }
        System.out.println(dp[n]);
    }
}
