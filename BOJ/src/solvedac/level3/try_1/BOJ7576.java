package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {

    static int M;
    static int N;
    static int[][] map;
    static Queue<Pos> q = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static class Pos {
        int x;
        int y;
        int day;
        Pos(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    q.offer(new Pos(i, j, 0));
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

            for(int i=0; i<4; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if(0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny] == 0) {
                    q.offer(new Pos(nx, ny, day+1));
                    map[nx][ny] = 1;
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

    private static boolean checkTomato() {

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0)
                    return false;
            }
        }
        return true;
    }


//    static int m;
//    static int n;
//    static int[][] map;
//    static int dx[] = {1, 0, -1, 0};
//    static int dy[] = {0, 1, 0, -1};
//
//    static Queue<Pos> q = new LinkedList<>();
//
//    static class Pos {
//        int x;
//        int y;
//        int day;
//        Pos(int x, int y, int day){
//            this.x = x;
//            this.y = y;
//            this.day = day;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        m = Integer.parseInt(st.nextToken());
//        n = Integer.parseInt(st.nextToken());
//
//        map = new int[n][m];
//
//        for(int i=0; i<n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for(int j=0; j<m; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//                if(map[i][j] == 1) { // 익은토마토 q에 넣음
//                    q.offer(new Pos(i, j, 0));
//                }
//            }
//        }
//        bfs();
//    }
//
//    static void bfs() {
//        int day = 0;
//
//        while(!q.isEmpty()) {
//            Pos pos = q.poll();
//            day = pos.day;
//
//            for(int i=0; i<4; i++) {
//                int nx = pos.x + dx[i];
//                int ny = pos.y + dy[i];
//
//                if(0 <= nx && nx < n && 0 <= ny && ny < m && map[nx][ny] == 0) {
//                    q.add(new Pos(nx, ny, day + 1));
//                    map[nx][ny] = 1;
//                }
//            }
//        }
//        if(checkTomato()) {
//            System.out.println(day);
//        }
//        else
//            System.out.println(-1);
//    }
//
//    static boolean checkTomato() {
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if (map[i][j] == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}
