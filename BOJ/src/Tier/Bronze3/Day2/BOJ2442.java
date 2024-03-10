package Tier.Bronze3.Day2;

import java.util.Scanner;

public class BOJ2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i=0; i<n; i++){
            for (int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
