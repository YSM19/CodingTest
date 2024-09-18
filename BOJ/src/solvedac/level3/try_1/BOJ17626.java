package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[1] = 1;

        int min = 0;
        for (int i=2; i<=n; i++) {
            min = Integer.MAX_VALUE;

            // 1에서 i보다 작은 제곱수에서 뺀 dp[i - j*j] 중
            // 최소를 선택
            for (int j=1; j*j <= i; j++) {
                int tmp = i - j*j;
                min = Math.min(min, dp[tmp]);
            }
            // 1을 더함
            dp[i] = min + 1;
        }
        System.out.println(dp[n]+"\n");
    }
}
