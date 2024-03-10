package Tier.Bronze3.Day2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st1.nextToken());
        int x2 = Integer.parseInt(st1.nextToken());
        int x3 = Integer.parseInt(st2.nextToken());
        int x4 = Integer.parseInt(st2.nextToken());
        int x5 = Integer.parseInt(st3.nextToken());
        int x6 = Integer.parseInt(st3.nextToken());

        String ans = "";

        if (x1==x3) ans = String.valueOf(x5);
        else if (x1==x5) ans = String.valueOf(x3);
        else if (x3==x5) ans = String.valueOf(x1);

        if (x2==x4) ans += (" "+String.valueOf(x6));
        else if (x2==x6) ans += (" "+ String.valueOf(x4));
        else if (x4==x6) ans += (" "+ String.valueOf(x2));

        bw.write(""+ans);
        bw.flush();
    }
}
