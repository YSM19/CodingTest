package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int ans = 0;

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<n; i++) {
            int cnt = 0;
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
                else break;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
