package Tier.Brnz2;

import java.util.Scanner;

public class BOJ10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            for (int k=0; k<i; k++){
                ans[k] = arr[k];
            }
            for (int k=0; k<=j-i; k++) {
                ans[i-1+k] = arr[j - 1-k];
            }
            for (int k=j; k<n; k++){
                ans[k] = arr[k];
            }

            for (int l=0; l<n; l++)
                arr[l] = ans[l];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

