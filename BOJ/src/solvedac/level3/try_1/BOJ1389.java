package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1389 {

    static int N, M;
    static int[][] rel;
    static final int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        rel = new int[N+1][N+1];

        for(int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                rel[i][j] = INF;
                if (i==j) rel[i][j] = 0;
            }
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            rel[s][e] = 1;
            rel[e][s] = 1;
        }

        for(int k=1; k<=N; k++) {
            for (int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    rel[i][j] = Math.min(rel[i][j], rel[i][k]+rel[k][j]);
                }
            }
        }
        int tmp = INF;
        int res = 0;
        for(int i=1; i<=N; i++) {
            int total = 0;
            for(int j=1; j<=N; j++) {
                total += rel[i][j];
            }

            if (tmp > total) {
                tmp = total;
                res = i;
            }
        }

        System.out.println(res);

    }
}
