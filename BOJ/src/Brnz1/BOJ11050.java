package Brnz1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int num = 1;
        int deno = 1;

        for (int i=0; i<k; i++){
            num *= n-i;
            deno *= k-i;
        }

        if (deno==0) System.out.println(0);
        else System.out.println(num/deno);
    }
}
