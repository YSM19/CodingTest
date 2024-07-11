package solvedac.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 호텔의 층수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int fir = N%H;
            if (fir==0) fir = H;
            int last = 1+N/H;
            if (N%H == 0) last -= 1;
            int mid = 0;
            if (last >= 10) {
                mid = last / 10;
                last = last % 10;
            }

            System.out.println(fir+""+mid+""+last);
        }

    }
}
