package Tier.Bronze5.sec02;

import java.io.IOException;
import java.util.Scanner;

public class BOJ2475_c {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<5; i++){
            int n = sc.nextInt();
            sum += n * n;
        }
        System.out.println(sum%10);

    }
}
