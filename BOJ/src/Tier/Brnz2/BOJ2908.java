package Tier.Brnz2;

import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int ans1 = a.charAt(0)-'0' + (a.charAt(1)-'0') * 10 + (a.charAt(2)-'0') * 100;
        int ans2 = b.charAt(0)-'0' + (b.charAt(1)-'0') * 10 + (b.charAt(2)-'0') * 100;

        if (ans1 >= ans2) System.out.println(ans1);
        else System.out.println(ans2);
    }
}
