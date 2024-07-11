package solvedac.level2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 세로줄 크기
        int M = Integer.parseInt(st.nextToken()); // 가로줄 크기

        String[] chessboard = new String[N];

        for (int i=0; i<N; i++) {
            chessboard[i] = br.readLine(); // 한줄씩 입력받는 String 배열
        }

        br.readLine();

        int cnt = Integer.MAX_VALUE; // 가장 큰 값으로 초기화
        for (int i=0; i<N-8; i++) { // 8x8 크기로 지정하기 위해 N-8만큼 반복
            for (int j=0; j<=M-8; j++) { // 8x8 크기로 지정하기 위해 M-8만큼 반복
                int resultCnt = getMinCost(i, j, chessboard);

                if (cnt > resultCnt) {
                    cnt = resultCnt;
                }
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        br.close();

    }

    private static int getMinCost(int startrow, int startcol, String[] chessboard) {
        String[] board = {"WBWBWBWB", "BWBWBWBW"};

        int whiteVerCnt = 0; // 화이트를 기준으로 최소 비용 고를 예정

        for (int i=0; i<8; i++) { // 세로 8
            int row = startrow + i; // 매개변수로 받은 chessboard의 값의 인덱스는 8x8이 아닌 전체범위이기 떄문
            for (int j=0; j<8; j++) { // 가로 8
                int col = startcol + j;

                if (chessboard[row].charAt(col) != board[row%2].charAt(j)) {
                    whiteVerCnt++;
                }
            }
        }

        // whiteVerCnt는 하얀버전으로 체스판을 자를때 최소비용이고, 64-whiteVercnt 하면 블랙의 최소비용
        return Math.min(whiteVerCnt, 64-whiteVerCnt);

    }
}
