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
        int maxDay = 0;
        for (int i=0; i<n; i++) {
            // 나무 자라는데 걸리는 시간 + 며칠 지났는지 + 심는데 하루
            maxDay = Math.max(maxDay, arr[i] + i + 1);
        }
        maxDay += 1;
        System.out.println(maxDay);
    }
}
