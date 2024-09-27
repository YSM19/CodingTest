package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];
        for (int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                st = new StringTokenizer(br.readLine());
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = M * N;


    }

}
