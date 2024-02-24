package Bronze3.Day2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int a1 = x < w-x ? x : w-x;
        int a2 = y < h-y ? y : h-y;

        int ans = a1 < a2 ? a1 : a2;

        bw.write(""+ans);
        bw.flush();

    }
}
