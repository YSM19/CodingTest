package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        String fullword = "";
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            for (int i=0; i<word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    fullword += word.charAt(i);
                }
            }
        }

        String ans = "";
        int index = 0;
        for (int i = 0; i<fullword.length(); i++){
            if (fullword.charAt(i) == "UCPC".charAt(index)){
                ans += fullword.charAt(i);
                index++;
            }
            if ("UCPC".equals(ans)) break;
        }

        //System.out.println(ans);
        if ("UCPC".equals(ans)) {
            System.out.println("I love UCPC");
        }
        else System.out.println("I hate UCPC");
    }
}
