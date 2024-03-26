package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        Integer[] arr2 = new Integer[n];
//        Integer[] wrapArr2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int ans = 0;
        for (int i=0; i<n; i++) {
            ans += arr1[i] * arr2[i];
        }

        System.out.println(ans);
    }
}
