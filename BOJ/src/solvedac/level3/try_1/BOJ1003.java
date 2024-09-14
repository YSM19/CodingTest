package solvedac.level3.try_1;

import java.io.*;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[][] arr = new int[40+1][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;

        while(T-- >  0) {
            int input = Integer.parseInt(br.readLine());
            if (input < 3) {
                bw.write(arr[input][0] + " " + arr[input][1] + "\n");
            }

            else {
                for (int i = 3; i <= input; i++) {
                    arr[i][0] = arr[i - 1][1] - arr[i - 1][0] + arr[i-1][0];
                    arr[i][1] = arr[i - 1][0] + arr[i - 1][1];
                }

                bw.write(arr[input][0] + " " + arr[input][1] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
