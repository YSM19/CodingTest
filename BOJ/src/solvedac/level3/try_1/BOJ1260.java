package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1260 {

    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new ArrayList[N+1];

        for (int i=1; i<=N; i++) {
            visited[i] = false;
        }

        for(int i=1; i<=N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
            Collections.sort(arr[s]);
        }

        sb = new StringBuilder();
        for (int i=1; i<=N; i++) {
            if (!visited[V]) {
                sb.append(V).append(" ");
                dfs(V);
            }
        }
        sb.append("\n");
        System.out.println(sb);
    }

    private static void dfs(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : arr[v]) {
            if (!visited[i]) {
                sb.append(i).append(" ");
                dfs(i);
            }
        }
    }
}
