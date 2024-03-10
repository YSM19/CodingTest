package Tier.Brnz2;

import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = i+1;
        }

        for (int t=0; t<m; t++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp;

            tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
