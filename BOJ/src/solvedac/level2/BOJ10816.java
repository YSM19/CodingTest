package solvedac.level2;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
            map.put(i, map.getOrDefault(i, Integer.parseInt(st.nextToken()) + 1));
        }
        map.
//        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] ans = new int[M];

        for (int i=0; i<M; i++) {
            int start = 0;
            int end = arr.length - 1;
            int mid_index = (start+end)/2;
            int mid_value = arr[mid_index];


        }


    }
}
