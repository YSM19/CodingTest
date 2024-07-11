package Tier.Brnz2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];

        for (int i=0; i<10; i++) {
            int A = Integer.parseInt(br.readLine());
            arr[A % 42]++;
        }
        int ans = 0;
        for (int i=0; i<42; i++) {
            if (arr[i] > 0) ans++;
        }
        System.out.println(ans);
    }
}
