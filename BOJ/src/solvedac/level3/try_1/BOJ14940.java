package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ14940 {
    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] map;
    static int sx;
    static int sy;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static class Pos {
        int x;
        int y;
        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        map = new int[n][m];

        for(int x=0; x<n; x++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            for(int y=0; y<m; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());

                if (map[x][y] == 2) {
                    sx = x;
                    sy = y;
                    map[x][y] = 0;
                }
            }
        }

        bfs(sx, sy);

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int x, int y) {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(x, y));
        visited[x][y] = true;

        while(!q.isEmpty()) {
            Pos pos = q.poll();

            for(int i=0; i<4; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if(nx < 0 || ny < 0 || nx>=n || ny>=m || visited[nx][ny] || map[nx][ny] == 0)
                    continue;

                visited[nx][ny] = true;
                q.add(new Pos(nx, ny));
                map[nx][ny] = map[pos.x][pos.y] + 1;
            }

        }



    }























//    static int n;
//    static int m;
//    static int[][] map;
//    static boolean[][] visited;
//    static int sx;
//    static int sy;
//    static int[] dx = {1, 0, -1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static class Pos {
//        int x;
//        int y;
//
//        Pos(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//
//        map = new int[n][m];
//        visited = new boolean[n][m];
//
//        for (int i=0; i<n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//
//                if (map[i][j] == 2) {
//                    sx = i;
//                    sy = j;
//                    map[i][j] = 0;
//                }
//            }
//        }
//
//        bfs(sx, sy);
//
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    private static void bfs(int x, int y) {
//        // 처음 시작 좌표 큐에 넣기
//        // Queue 선언
//        Queue<Pos> q = new LinkedList<>();
//        // 시작 좌표를 큐에 추가
//        q.add(new Pos(x, y));
//        // 시작 좌표를 방문처리
//        visited[x][y] = true;
//
//        // 큐가 빌떄까지 반복
//        while(!q.isEmpty()) {
//            // 큐에서 좌표를 하나 꺼냄
//            Pos pos = q.poll();
//            // 상하좌우 탐색
//            for (int i = 0; i < 4; i++) {
//                int cx = pos.x + dx[i];
//                int cy = pos.y + dy[i];
//
//                if (cx < 0 || cy < 0 || cx >= n || cy >= m || visited[cx][cy] || map[cx][cy] == 0) {
//                    continue;
//                }
//
//                // 새로 이동할 수 있는 좌표를 큐에 추가
//                q.add(new Pos(cx, cy));
//                visited[cx][cy] = true;
//                map[cx][cy] = map[pos.x][pos.y] + 1;
//
//            }
//        }
//    }
}
