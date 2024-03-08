package Brnz1;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res[] = new int[10];
        int cnt = 0;
        int[] remain = new int[10];

        while (true){
            remain[cnt] = n%b;
            n = n / b;
            cnt++;

            if (n==0) break;
        }

//        Integer[] wrap = Arrays.stream(remain).boxed().toArray(Integer[]::new);
//        Arrays.sort(wrap, Collections.reverseOrder());

        for (int i=9; i>=0; i--){
            //if (0==(remain[i])) continue;
            res[9-i] = remain[i];
            System.out.println(res[9-i]);
        }
    }
}
