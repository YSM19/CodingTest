package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int res = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            StringTokenizer st1 = new StringTokenizer(st.nextToken(), "+");
            int plus = 0;

            while (st1.hasMoreTokens()) {
                plus += Integer.parseInt(st1.nextToken());
            }

            if (res == Integer.MAX_VALUE) {
                res = plus;
            }
            else {
                res -= plus;
            }
        }

        System.out.println(res);
    }
}
