package Tier.Brnz2;

import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < n; i++) {
            int num = i;
            int sum = 0; // 각 자리수를 더한 값을 저장

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == n) {
                ans = i;
                break;
            }

        }
        System.out.println(ans);
    }
}
