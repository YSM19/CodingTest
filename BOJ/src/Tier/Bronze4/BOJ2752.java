package Tier.Bronze4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String answer = "";
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] num_list = new int[3];
        for (int i=0; i<3; i++){
            num_list[i] += Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num_list);

        for (int i=0; i<3; i++) {
            answer += num_list[i] + " ";
        }
        br.close();
        bw.write(answer+ "");
        bw.flush();
        bw.close();

    }
}
