package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int[] dp = new int[X+1];
        dp[0] = dp[1] = 0;

        for (int i=0; i<X; i++) {
            dp[i] = dp[i-1] +1;
            if (X%3==0) {
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }
            if (X%2==0) {
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
        }

        System.out.println(dp[X]);
    }
}
