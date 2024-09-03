package solvedac.level2.retry_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while (cnt != N) {
            num++;

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);

    }
}
