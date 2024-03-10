package Tier.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if(s+k+h>=100){
            bw.write("OK");
        }
        else{
            if(s<k && s<h){
                bw.write("Soongsil");
            }
            else if(k<h && k<s){
                bw.write("Korea");
            }
            else if(h<k && h<s){
                bw.write("Hanyang");
            }
        }
        bw.flush();
    }
}
