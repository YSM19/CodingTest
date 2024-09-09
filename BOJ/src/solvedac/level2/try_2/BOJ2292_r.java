package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int range = 2;
        // N: 1     cnt 1   ans 1
        // N: 2~7   cnt 6   ans 2
        // N: 8~19  cnt 12  ans 3
        // 2+(6*cnt)

        if (N==1) System.out.println(1);
        else {
            while (range <= N) {
                range = range + (6*cnt);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
