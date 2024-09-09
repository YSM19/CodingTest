package solvedac.level2.try_1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

//        int[] ans = new int[M];

        for (int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());

            // upperBound와 lowerBound의 차이 값을 구한다.
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        // lo가 hi와 같아질때까지 반복
        while (low < high) {
            int mid = (low + high) / 2; // 중간위치를 구한다.

            /**
             * key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             * (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        // lo가 hi랑 같아질때까지 반복
        while (low < high) {
            int mid = (low + high) / 2;

            // key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                high = mid;
            }

            // 중복원소의 경우 else에서 처리된다.
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
