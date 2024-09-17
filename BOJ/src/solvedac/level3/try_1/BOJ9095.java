package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[10000];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int j=0; j<n; j++) {
            int num = Integer.parseInt(br.readLine());
            if(num < 4) {
                System.out.println(dp[num]);
                continue;
            }
            for (int i = 4; i <= num; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

            }
            System.out.println(dp[num]);
        }
    }
}
