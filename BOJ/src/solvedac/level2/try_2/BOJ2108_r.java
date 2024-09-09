package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2108_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%.0f", sum)).append("\n");

        int mid = arr[N/2];
        sb.append(mid).append("\n");

        int cnt = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;

        for (int i=0; i<N-1; i++) {
            if (arr[i]==arr[i+1]) {
                cnt++;
            }
            else{
                cnt = 0;
            }

            if (cnt > max) {
                max = cnt;
                mod = arr[i];
                check = true;
            }
            else if (cnt == max && check == true) {
                mod = arr[i];
                check = false;
            }

        }
        sb.append(mod).append("\n");

        int range = arr[N-1]-arr[0];
        sb.append(range).append("\n");

        System.out.println(sb);
    }
}
