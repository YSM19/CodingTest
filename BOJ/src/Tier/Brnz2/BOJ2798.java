package Tier.Brnz2;

import java.util.Scanner;

public class BOJ2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int ans = 0;

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    sum = arr[i] + arr[j] + arr[k];

                    if(ans < sum && sum <= m)
                        ans = sum;
                }
            }
        }
        System.out.println(ans);
    }
}
