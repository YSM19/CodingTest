package Tier.Brnz2;

import java.io.*;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int ans = 0;

        for (int i=0; i<s.length(); i++) {
            if (' '==s.charAt(i)){
                ans+=1;
            }
        }
        if(s.charAt(0)==' ') ans-=1;
        if(s.charAt(s.length()-1)==' ') ans-=1;

        bw.write(""+(ans+1));
        bw.flush();
    }
}
