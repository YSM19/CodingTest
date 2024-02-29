package Brnz2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        if(c<=b) System.out.println(-1);
        else System.out.println(a/(c-b)+1);
    }
}
