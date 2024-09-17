package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            String[] s = new String[n];
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                s[i] = st.nextToken();
            }

            int cnt = 0;
            for(int j=0; j<s.length-1; j++) {
                if (s[j].equals(s[j+1])) {
                    continue;
                }
                cnt++;
            }

            int ans = n + cnt;
            System.out.println(ans);
        }

    }
}
