package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ21736 {

    static int n, m;
    static char[][] map;
    static boolean[][] visited;
    static int cx, cy;
    static int cnt;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static class point {
        int x;
        int y;

        public point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m 입력
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // map, visited 배열 선언
        map = new char[n][m];
        visited = new boolean[n][m];

        // 문자열을 입력받아 map에 저장, 본인 위치를 찾아 dx, dy에 기록
        for (int i=0; i<n; i++) {
            String str = br.readLine();

            for (int j=0; j<n; j++) {
                map[i][j] = str.charAt(j);

                if (map[i][j] == 'I') {
                    cx = i;
                    cy = j;
                }
            }
        }

        // bfs 탐색 / 시작: (cx, cy)
        bfs(cx, cy);

        // cnt가 0이면 TT 출력
        if (cnt != 0) {
            System.out.println(cnt);
        }
        else {
            System.out.println("TT");
        }
    }

    // bfs 구현
    private static void bfs(int x, int y) {
        // BFS를 위한 큐 생성
        Queue<point> q = new LinkedList<>();
        // 처음 위치를 큐에 추가하며 탐색 시작
        q.add(new point(x, y));
        visited[x][y] = true;

        // 큐가 빌때까지 탐색 반복
        while (!q.isEmpty()) {
            // 큐에서 현재 위치 꺼내고
            point pos = q.poll();

            // 4방향 상하좌우로 이동 가능한지 확인
            for (int i=0; i<4; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                // 범위, 방문, 벽인 경우
                if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny] || map[nx][ny] == 'X') {
                    continue;
                }

                // 사람을 만나면 cnt++
                if (map[nx][ny] == 'P') {
                    cnt++;
                }

                // 방문처리
                visited[nx][ny] = true;
                // 추가 탐색
                q.add(new point(nx, ny));
            }
        }
    }

}
