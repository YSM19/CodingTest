package Tier.Brnz2;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            int num = sc.nextInt();

            if (num == 1) continue;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }

//            double sqrt = Math.sqrt(num);
//            if (sqrt > 1 && sqrt <= 10) {
//                if (sqrt % 2 != 0 || sqrt % 3 != 0 || sqrt % 5 != 0 || sqrt % 7 != 0)
//                    cnt++;
//            }
//        }
        }
        System.out.println(cnt);
    }
}