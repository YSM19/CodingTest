package solvedac.level2.try_2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1018_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chessboard = new String[N];

        for (int i = 0; i < N; i++) {
            chessboard[i] = br.readLine();
        }

        br.readLine();

        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i < N-8; i++) {
            for (int j = 0; j < M-8; j++) {
                int resultCnt = getMinCost(i, j, chessboard);

                if (cnt > resultCnt) {
                    cnt = resultCnt;
                }
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }

    private static int getMinCost(int startrow, int startcol, String[] chessboard) {
        String[] board = {"WBWBWBWB", "BWBWBWBW"};

        int whiteVerCnt = 0; // 화이트를 기준으로 최소비용 고를예정

        for (int i=0; i<8; i++) {
            int row = startrow + i;
            for (int j=0; j<8; j++) {
                int col = startcol + j;

                if (chessboard[row].charAt(col) != board[row%2].charAt(j)) {
                    whiteVerCnt++;
                }
            }
        }
        return Math.min(whiteVerCnt, 64-whiteVerCnt);
    }
}
