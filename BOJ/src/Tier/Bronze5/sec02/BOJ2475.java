package Tier.Bronze5.sec02;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<5; i++) {
            int n = sc.nextInt();

            sum += n * n;

        }
        int result = sum % 10;
        System.out.println(result);

    }
}
