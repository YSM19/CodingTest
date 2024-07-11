package solvedac.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1; // 겹수(최소 루트)
        int range = 2; // 범위 (최솟값 기준)

        // N: 1 개수 1 ans 1
        //   2~7   6      2
        //   8~19  12     3
        //  2+(6*cnt)

        if(N==1)
            System.out.print(1);
        else {
            while (range <= N) { // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * cnt);
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}
