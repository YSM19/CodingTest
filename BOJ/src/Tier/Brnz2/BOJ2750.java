package Tier.Brnz2;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
