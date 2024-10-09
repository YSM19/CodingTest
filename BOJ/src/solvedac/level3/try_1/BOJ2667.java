package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2667 {

    static int N, cnt;
    static boolean[][] visited;
    static int[][] map;
    static List<Integer> res;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        res = new LinkedList<>();
        map = new int[N][N];
        visited = new boolean[N][N];
        cnt = 1;

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                dfs(i, j);
                res.add(cnt);
                cnt = 1;
            }
        }
        Collections.sort(res);
        System.out.println(res.size());
        for(int x : res) {
            System.out.println(x+"\n");
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || nx>=N || ny<0 || ny >= N || map[nx][ny]==0 || visited[nx][ny])
                continue;
            cnt++;
            dfs(nx, ny);
        }
    }

































//    static int N, cnt;
//    static int[][] map;
//    static boolean[][] visited;
//    static int[] dx = {1, 0, -1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static List<Integer> res;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        N = Integer.parseInt(br.readLine());
//        map = new int[N][N];
//        visited = new boolean[N][N];
//        res = new LinkedList<>();
//        cnt = 1;
//
//        for (int i=0; i<N; i++) {
//            String str = br.readLine();
//            for (int j=0; j<N; j++) {
//                map[i][j] = str.charAt(j) - '0';
//            }
//        }
//
//        for (int i=0; i<N; i++) {
//            for (int j=0; j<N; j++) {
//                dfs(i, j);
//                res.add(cnt);
//                cnt = 1;
//            }
//        }
//        Collections.sort(res);
//        int size = res.size();
//        System.out.println(size);
//        for(int i=0; i<size; i++) {
//            System.out.println(res.get(i));
//        }
//
//    }
//
//    private static void dfs(int x, int y) {
//        visited[x][y] = true;
//
//        for (int i=0; i<4; i++) {
//            int nx = dx[i] + x;
//            int ny = dy[i] + y;
//
//            if (nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny] || map[nx][ny] == 0) {
//                continue;
//            }
//            cnt++;
//            dfs(nx, ny);
//        }
//    }
}
