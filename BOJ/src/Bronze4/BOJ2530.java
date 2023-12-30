package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String time = br.readLine();

        StringTokenizer st = new StringTokenizer(time, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int addTime = Integer.parseInt(br.readLine());

        c += addTime;

        b+=c/60;
        c%=60;

        a+=b/60;
        b%=60;

        a%=24;

        bw.write(a+" "+b+" "+c);
        br.close();
        bw.flush();
        bw.close();
    }
}
