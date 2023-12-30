package Bronze4;

import java.io.*;

public class BOJ11720___c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num_list = br.readLine();
        int ans = 0;

        for (int i=0; i<n; i++){
            ans += num_list.charAt(i) -'0';
        }
        bw.write(ans+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
