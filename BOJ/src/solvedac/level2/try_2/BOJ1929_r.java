package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929_r {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = M; i<N; i++) {
            boolean isPrime = true;

            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sb.append(i+"\n");
            }
        }

        System.out.println(sb);

    }
}
