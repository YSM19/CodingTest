package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16928 {
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[101];
        for(int i=1; i<=N; i++) {
            board[i] = i;
        }
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            board[idx] = val;
        }
        for(int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            board[idx] = val;
        }

        System.out.println(bfs(1));

    }


    static int bfs(int start) {
        // check 배열
        int[] visit = new int[101];
        Queue<Integer> q = new LinkedList<>();
        // q에 시작점 넣기
        q.offer(start);
        visit[start] = 0;

        while(true) {
            int visitedNum = q.poll();
            for (int i = 1; i <= 6; i++) {
                int nextNum = visitedNum + i;

                if(nextNum > 100) {
                    continue;
                }
                //  아직 방문하지 않은 노드를 큐에 넣고 탐색을 계속
                if (visit[board[nextNum]] == 0) {
                    q.offer(board[nextNum]);
                    // 값 증가
                    visit[board[nextNum]] = visit[visitedNum] + 1;
                }
                if(board[nextNum] == 100) {
                    return visit[100];
                }
            }
        }
    }

}
