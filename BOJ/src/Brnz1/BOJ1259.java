package Brnz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        while (true) {
            String ans = "yes";
            s = br.readLine();
            if (Integer.parseInt(s)==0) break;

            if (s.length() == 2 || s.length() == 3){
                if (s.charAt(0) != s.charAt(s.length()-1)) {
                    ans = "no";
                }
            }
            else if (s.length() == 4 || s.length() == 5) {
                if ((s.charAt(0) != s.charAt(s.length()-1)) || (s.charAt(1) != s.charAt(s.length() - 2))){
                    ans = "no";
                }
            }

            System.out.println(ans);
        }

    }
}
