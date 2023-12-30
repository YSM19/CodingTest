package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true){
            st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            if (m==0&&f==0){
                break;
            }

            bw.write(m+f + "\n");

        }
        bw.flush();
        br.close();
        bw.close();

    }
}
