package Bronze3.Day2;

import java.io.*;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String ans = "";

        int n = s.length()/10;
        for (int i=0; i<n; i++){
            String temp = s.substring(10*i, 10*(i+1));
            ans += temp+"\n";

        }
        if (s.length()%10 < 10) ans += s.substring(10*(n));

        bw.write(""+ans);
        bw.flush();

    }
}
