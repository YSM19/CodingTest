package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N==0) {
            System.out.println(0);
            return;
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += arr[i];
            if (sum > M) {
                cnt++;
                sum = 0;
                i-=1;
            }
        }
        System.out.println(cnt+1);
    }
}
