package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int cnt = 0;
        int start = 1;
        int end = m;

        for (int i=0; i<j; i++) {
            int targetPos = Integer.parseInt(br.readLine());
            if (start > targetPos) {
                cnt += start-targetPos;
                end -= start-targetPos;
                start = targetPos;
            }
            else if (end < targetPos) {
                cnt += targetPos - end;
                start += targetPos - end;
                end = targetPos;
            }
        }

        System.out.println(cnt);
    }
}
