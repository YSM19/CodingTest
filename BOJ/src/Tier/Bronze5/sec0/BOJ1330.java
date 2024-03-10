package Tier.Bronze5.sec0;

import java.util.Scanner;

public class BOJ1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b)
            System.out.print(">");
        else if (a<b)
            System.out.print("<");
        else
            System.out.print("=");
    }
}
