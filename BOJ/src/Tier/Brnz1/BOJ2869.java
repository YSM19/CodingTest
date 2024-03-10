package Tier.Brnz1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double v = Integer.parseInt(st.nextToken());

        double res = (v-b)/(a-b);
        int ans = (int) Math.ceil(res);

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
