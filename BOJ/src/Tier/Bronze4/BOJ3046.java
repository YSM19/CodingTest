package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ3046 {
    public static void main(String[] args) throws IOException {
        // R1 + answer / 2 = S
        //answer = 2 * S - R1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int answer = 2 * s - r1;
        bw.write(answer + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
