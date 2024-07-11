package solvedac.level2;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

//        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i=0; i<N; i++) {
            bw.write(arr[i]+"\n");
            bw.flush();
//            System.out.println(arr[i]);
        }
        bw.close();
    }
}
