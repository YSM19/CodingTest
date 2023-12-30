package Bronze3.Day1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int add = Integer.parseInt(br.readLine());

        b+=add;
        if(b >= 60){
            a+=b/60;
            b%=60;
        }
        if(a>=24){
            a%=24;
        }

        bw.write(a+" "+b);
        bw.flush();
    }
}
