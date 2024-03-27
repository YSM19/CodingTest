package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i = 1;
        int cnt = 0;

        while (true) {
            n=n-i;
            cnt++;
            i++;
            if (n<0) break;
        }

        System.out.println(cnt-1);
    }
}
