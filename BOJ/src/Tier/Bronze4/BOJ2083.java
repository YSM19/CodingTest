package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ans = "";
        while (true) {
            String str = br.readLine();
            if(str.equals("# 0 0")) break;
            StringTokenizer st = new StringTokenizer(str);

            ans = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());


            if(a>17 || w>=80){
                ans += " Senior";
            }
            else ans += " Junior";

            bw.write(ans+"\n");
            bw.flush();

        }

    }
}
