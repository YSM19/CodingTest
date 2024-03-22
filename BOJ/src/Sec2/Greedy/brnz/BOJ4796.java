package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if (l==0 && p==0 && v==0) break;

            int res = (v/p) * l + Math.min(l, v%p);

            sb.append("Case ");
            sb.append(cnt);
            sb.append(": ");
            sb.append(res);

            System.out.println(sb);

            sb.delete(0, sb.length());
            cnt++;
        }
    }
}
