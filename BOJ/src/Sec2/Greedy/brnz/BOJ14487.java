package Sec2.Greedy.brnz;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14487 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;

        for (int i=0; i<n-1; i++){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
