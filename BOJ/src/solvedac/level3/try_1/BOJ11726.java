package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[1001];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        if(n < 3) {
            System.out.println(arr[n]);
        }

        else {
            for (int i = 3; i <= n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
            }

            System.out.println(arr[n]);
        }
    }
}
