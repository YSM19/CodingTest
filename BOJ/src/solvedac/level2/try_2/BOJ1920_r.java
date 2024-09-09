package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            if (binarySearch(A, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (key < arr[mid]) { // 값이 중간보다 작으면
                high = mid - 1;
            }

            else if (key > arr[mid]) { // 값이 중간보다 크면
                low = mid + 1;
            }

            else {
                return mid;
            }

        }
        return -1;
    }
}
