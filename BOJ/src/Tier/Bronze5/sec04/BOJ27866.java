package Tier.Bronze5.sec04;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ans = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(ans.charAt(n-1));
    }
}
