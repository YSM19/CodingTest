package Tier.Bronze5.sec04;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = "";

        for (char x: s.toCharArray()) {
            if(Character.isUpperCase(x)){
                ans += Character.toLowerCase(x);
            }
            else ans += Character.toUpperCase(x);

        }
        System.out.println(ans);
    }
}
