package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];

        int min = 0;
        int mid = 0;
        int max = 0;
        for (int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        while (min < max) {
            mid = (min+max)/2;
            int cnt = 0;

            for(int i=0; i<K; i++) {
                cnt += arr[i] / mid;
            }

            if(cnt < N) {
                max = mid;
            }
            else {
                min = mid+1;
            }
        }
        System.out.println(min-1);

    }
}
