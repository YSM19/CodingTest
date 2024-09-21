package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {

    static int cnt;
    static int M, N, K;
    static boolean[][] visited;
    static int[][] cabbage;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbage = new int[M][N];
            visited = new boolean[M][N];

            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());

                cabbage[p1][p2] = 1;
            }

            for(int x=0; x<M; x++) {
                for (int y=0; y<N; y++) {
                    if (cabbage[x][y]==1 && !visited[x][y]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cx < M && cy >= 0 && cy < N) {
                if (!visited[cx][cy] && cabbage[cx][cy]==1) {
                    dfs(cx, cy);
                }
            }
        }


    }
}
