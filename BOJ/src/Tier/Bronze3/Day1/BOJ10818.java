package Tier.Bronze3.Day1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[n];
        for (int i=0; i<n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        bw.write(list[0]+" "+list[n-1]);
        bw.flush();
    }
}
