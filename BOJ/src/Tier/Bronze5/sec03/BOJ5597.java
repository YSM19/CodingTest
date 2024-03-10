package Tier.Bronze5.sec03;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        int a[] = new int[31];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<28; i++){
            int number = sc.nextInt();
            a[number]++;
        }

        for (int i=1; i<=30; i++){
            if(a[i]==0)
                System.out.println(i);
        }
    }
}
