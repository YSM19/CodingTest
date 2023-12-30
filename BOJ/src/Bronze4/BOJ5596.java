package Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int s = 0;
        int t = 0;

        for (int i=0; i<4; i++){
            s += Integer.parseInt(st1.nextToken());
            t += Integer.parseInt(st2.nextToken());
        }

        if(s<t){
            bw.write(t+"");
        }
        else if(s>t){
            bw.write(s+"");
        } else if (s==t) {
            bw.write(s+"");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
