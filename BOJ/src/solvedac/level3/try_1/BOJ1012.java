package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

            int n = Integer.parseInt(st.nextToken());
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

//            dfs(1);

        }
    }

//    private static void dfs(int start) {
//        if (-1 >= start && start <=)
//    }
}
