package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String ans;

        in = in.replaceAll("XXXX", "AAAA");
        in = in.replaceAll("XX", "BB");

        ans = in;
        if (in.contains("X")) ans = "-1";

        System.out.println(ans);

    }
}
