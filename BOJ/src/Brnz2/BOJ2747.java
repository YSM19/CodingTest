package Brnz2;

import java.util.Scanner;

public class BOJ2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);

    }
}
