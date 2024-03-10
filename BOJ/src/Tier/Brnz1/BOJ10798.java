package Tier.Brnz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }

        }

        for (int i=0; i<15; i++){
            for (int j=0; j<5; j++){
                if ('\0' == arr[j][i]) {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }

    }
}
