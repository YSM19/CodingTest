package Tier.Bronze3.Day1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());


            int c = n/h +1;
            int a = n%h;
            int b=0;

            if(c%10==0){
                b = c/10;
                c%=10;
                
            }

            bw.write(a+""+b+""+c+"\n");

        }
        bw.flush();
    }
}
