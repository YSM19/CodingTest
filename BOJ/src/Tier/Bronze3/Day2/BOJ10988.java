package Tier.Bronze3.Day2;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String isEqual = "";
        for (int i=s.length()-1; i>=0; i--) {
            isEqual += s.charAt(i);
        }
        System.out.println(s.equals(isEqual) ? 1 : 0);
    }
}
