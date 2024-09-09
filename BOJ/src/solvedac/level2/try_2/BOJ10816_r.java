package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // -10 -10 2 3 3 6 7 10 10

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(key, arr) - lowerBound(key, arr)).append(" ");
        }
        System.out.println(sb);
    }

    public static int lowerBound(int key, int[] arr) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (key <= arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int key, int[] arr) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
