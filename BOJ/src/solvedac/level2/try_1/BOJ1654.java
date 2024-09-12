package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        long  max = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (min + max) / 2;

            long cnt = 0;

            // 중간 길이로 잘라서 총 몇 개가 만들어지는지 구하기
            for (int i=0; i<arr.length; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < N) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }

    }
}
