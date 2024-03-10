package Tier.Bronze3.Day1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m-45<0){
            if(h==0){
                h=23;
            }
            else h=h-1;
            m=m+15;
        }
        else m=m-45;

        bw.write(h+" "+m);
        bw.flush();
    }
}
