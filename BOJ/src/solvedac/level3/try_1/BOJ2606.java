package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ2606 {

    static int cnt, node, line;
    static boolean[] visited;
    static List[] computers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        // 연결된 노드의 쌍 입력
        visited = new boolean[node+1];
        // 연결된 컴퓨터 저장 배열
        computers = new List[node+1];
        // 감염된 컴퓨터 수
        cnt = 0;

        for(int i=1; i<node+1; i++) {
            computers[i] = new ArrayList<Integer>();
        }

        StringTokenizer st;
        for (int i=0; i<line; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computers[a].add(b);
            computers[b].add(a);
        }
        dfs(1);

        System.out.println(cnt-1);
    }

    private static void dfs(int start) {
        if (!visited[start]) {
            visited[start] = true;
            cnt++;

            for (int i = 0; i <= computers[start].size(); i++) {
                dfs((int) computers[start].get(i));
            }
        }
    }
}
