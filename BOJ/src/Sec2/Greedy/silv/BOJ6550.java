package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringTokenizer st;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            String s = st.nextToken();
            String t = st.nextToken();

            String correct = "";
            int index = 0;
            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(index) == t.charAt(i)) {
                    correct += s.charAt(index);
                    index++;
                }
                if (s.equals(correct)) {
                    break;
                }
            }
            if (s.equals(correct)) {
                System.out.println("Yes");
            } else System.out.println("No");

        }
    }
}
