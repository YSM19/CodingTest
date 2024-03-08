package Brnz1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int ans = arr[0] * arr[n-1];
        System.out.println(ans);
    }
}
