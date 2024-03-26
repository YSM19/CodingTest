package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ28014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] <= arr[j]) {
                    cnt++;
                }
                else break;

            }
        }
        System.out.println(cnt);

    }
}
