package solvedac.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = N;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int j=0; j<N; j++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 0 || num == 1) {
                ans -= 1;
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    ans -= 1;
                    break;
                }
            }

        }
        System.out.println(ans);
    }
}
