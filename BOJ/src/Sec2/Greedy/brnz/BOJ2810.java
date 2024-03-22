package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        s= s.replace("LL", "S");

        if (s.length()+1 > n) System.out.println(n);
        else System.out.println(s.length()+1);




    }
}
