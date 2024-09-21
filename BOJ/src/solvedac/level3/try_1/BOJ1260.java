package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {
    static int node, line, start;
    static boolean[] visited;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        for (int i=1; i<=line; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s][e] = arr[e][s] = 1;
        }

        dfs(start);
        sb.append("\n");

        visited = new boolean[node+1];
        bfs(start);

        System.out.println(sb);
    }

    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");

        for (int i=1; i<=node; i++) {
            if (arr[v][i]==1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        q.add(v); // 시작 노드를 큐에 추가
        visited[v] = true; // 시작 노드를 방문처리

        while(!q.isEmpty()) { // 큐가 비어있지 않은동안 반복
            start = q.poll(); // 큐에서 노드를 꺼냄
            sb.append(start + " "); // 현재 노드를 출력

            for (int i=1; i<=node; i++) { // 모든 노드에 대해 인접 여부 확인
                if (arr[start][i]==1 && !visited[i]) { // 인접 노드중 방문하지 않은 노드 찾기
                    q.add(i); // 그 노드를 큐에 추가
                    visited[i] = true; // 방문처리
                }
            }
        }

    }

}
