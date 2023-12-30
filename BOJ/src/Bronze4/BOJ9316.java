package Bronze4;

import java.io.*;

public class BOJ9316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            bw.write("Hello World, Judge "+(i+1)+"!\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
