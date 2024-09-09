package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int avgnum = (int) Math.round(n * 0.15);

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        double ans = 0;
        for (int i=avgnum; i<n-avgnum; i++) {
            ans += arr[i];
        }
        double result = ans/(n-avgnum*2);
        ans = (int) Math.round(result);

        System.out.println((int)ans);
    }
}
