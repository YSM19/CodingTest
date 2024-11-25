package solvedac.level3.try_1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
            }
        }
//        Arrays.sort(arr);

//        int start = 0;
//        int end = arr[N-1];
        int mid = 0;

        while (min < max) {

            mid = (min+max)/2;
            long sum = 0;
            for (int i=0; i<N; i++) {
                int num = arr[i] - mid;
                if(num > 0) {
                    sum += num;
                }
            }

            if (sum == M) break;
            else if (M < sum) {
                min = mid+1;
            }
            else if (M > sum) {
                max = mid;
            }
        }

        bw.write(mid+"");
        bw.flush();
        bw.close();

    }
}
