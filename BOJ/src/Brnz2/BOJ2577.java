package Brnz2;

import java.io.*;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String ans = String.valueOf(a*b*c);

        int[] n = new int[10];

        for (char x: ans.toCharArray()){
            n[x-'0'] += 1;
        }

        for (int i=0; i<=9; i++){
            System.out.println(n[i]);
        }
    }
}
