package Tier.Bronze4;

import java.io.*;

public class BOJ11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if(str.equals("END")) break;

            String ans = "";

            for (int i=str.length()-1; i>=0; i--){
                 ans += str.charAt(i);
            }
            bw.write(ans+"\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
