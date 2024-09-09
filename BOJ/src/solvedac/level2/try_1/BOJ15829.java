package solvedac.level2.try_1;

import java.io.*;

public class BOJ15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());

        String str = br.readLine();

        long answer = 0;
        long r = 1;
        int M = 1234567891;

        for (int i=0; i<L; i++) {
            int anum = (int) str.charAt(i) - 96;
            answer += anum * r % M;
            r = r*31 % M;
        }

        bw.write(answer% M+"\n");
        bw.flush();

    }
}
