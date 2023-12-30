package Bronze4;

import java.io.*;

public class BOJ4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String ans = "";
        for (int i=1; i<=n; i++){
            ans += i+". "+br.readLine()+"\n";
        }
        bw.write(ans+"");
        bw.flush();
    }
}
