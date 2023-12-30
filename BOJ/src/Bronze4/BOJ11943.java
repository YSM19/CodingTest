package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        int ans = 0;

        if(a+d <= b+c){
            ans = a+d;
        }
        else ans = b+c;

        bw.write(ans+"");
        br.close();
        bw.flush();
        bw.close();

    }
}
