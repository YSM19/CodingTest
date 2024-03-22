package Sec2.Greedy.brnz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        s = s.replace("6", "5");

        StringTokenizer st = new StringTokenizer(s);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a+b).append(" ");

        s = s.replace("5", "6");

        st = new StringTokenizer(s);

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        sb.append(a+b);
        System.out.println(sb);

    }
}
