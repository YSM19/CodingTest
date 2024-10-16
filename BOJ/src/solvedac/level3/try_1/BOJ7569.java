package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569 {

    static int M, N, H;
    static int[][][] map;
    static Queue<Pos> q = new LinkedList<>();
    static int[] dx = {1, -1, 0, 0, 0, 0}; // 3차원 배열 이렇게 선언
    static int[] dy = {0, 0, 1, -1, 0, 0}; // ;;
    static int[] dz = {0, 0, 0, 0, 1, -1}; // ;;
    static class Pos {
        int x, y, z;
        int day;
        Pos(int x, int y, int z, int day) {
            this.x = x;
            this.y= y;
            this.z = z;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());

                    if (map[i][j][k] == 1) {
                        q.offer(new Pos(i, j, k, 0));
                    }
                }
            }
        }

        bfs();
    }

    private static void bfs() {
        int day = 0;

        while(!q.isEmpty()) {
            Pos pos = q.poll();
            day = pos.day;

            for(int i=0; i<6; i++) { // 3차원 배열 이렇게 6번 돌게 선언
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                int nz = pos.z + dz[i];

                if(0 <= nx && nx < H && 0 <= ny && ny < N && 0 <= nz && nz < M && map[nx][ny][nz] == 0) {
                    q.offer(new Pos(nx, ny, nz, day+1));
                    map[nx][ny][nz] = 1; // nx, ny, nz
                }
            }
        }

        if(checkTomato()) {
            System.out.println(day);
        }
        else {
            System.out.println(-1);
        }
    }

    static boolean checkTomato() {
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(map[i][j][k] == 0)
                        return false;
                }
            }
        }
        return true;
    }
}
