package Tier.Bronze5.sec03;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            String str = sc.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }




    }
}
