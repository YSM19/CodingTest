package Brnz1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        for (int i=0; i<c; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] score = new int[n];
            int sum = 0;
            double cnt = 0;
            for (int j=0; j<n; j++){
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            int avg = sum / n;
            for (int k=0; k<n; k++){
                if(score[k] > avg) cnt++;
            }
            double ans = cnt/n * 100;
            bw.write(String.format("%.3f", ans)+"%\n");

        }
        bw.flush();

    }
}
