package Tier.Bronze4.sec04;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<6; i++){
            for (int j=5; j>i; j--)
                System.out.print(" ");
            for (int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
