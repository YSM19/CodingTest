package Bronze4;

import java.io.*;

public class BOJ5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int p1 = 0;
        int p2 = 0;

        if(a<=b && a<=c) {
            p1 = a;
        } else if (b<=a && b<=c) {
            p1 = b;
        }
        else if (c<=a && c<=b){
            p1 = c;
        }
        if(d<=e){
            p2 = d;
        } else if (e<=d) {
            p2 = e;
        }

        int answer = p1 + p2 - 50;
        br.close();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
