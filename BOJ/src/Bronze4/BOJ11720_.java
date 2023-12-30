package Bronze4;

import java.io.*;

public class BOJ11720_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        for (int i=0; i<n; i++){
             answer += str.charAt(i) -'0';
        }
        bw.write(answer+"\n");
        bw.flush();

        br.close();

        bw.close();
    }
}
