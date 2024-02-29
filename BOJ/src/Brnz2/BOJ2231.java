package Brnz2;

import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i=1; i<n; i++){
            String s = String.valueOf(i);
            int sum = i + (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');

            if (sum == n){
                ans = i;
                break;
            }

        }
        System.out.println(ans);
    }
}
