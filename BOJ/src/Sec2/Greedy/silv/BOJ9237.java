package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        //4 3 3 2
        int cnt = 0;
        for (int i=0; i<n; i++) {
            // 4 3 3 2 / 39 39 38 35 20 9  / 6 6 6 6
            // 4 3 2 1 / 39 38 37 36 35 34 / 6 5 4 3
            if(arr[i] > arr[0]-i) {
                cnt++;
            }
        }
        int ans = cnt + arr[0] + 1;
        System.out.println(ans);
    }
}
