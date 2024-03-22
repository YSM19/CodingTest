package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int j=0; j<n-1; j++) {
            //if (arr[j+1] - arr[j] == 1) cnt++;
            if (arr[j]==0 && arr[j+1]==1) {
                if (arr[j]==1 && arr[j+1]==2) {
                    if (arr[j]==2 && arr[j+1]==0) {
                        cnt++;
                    }
                    cnt++;
                }
                cnt++;
            }

            if (arr[j]==0) cnt++;
        }
        if (cnt > n) cnt = n;

        System.out.println(cnt+1);

    }
}
