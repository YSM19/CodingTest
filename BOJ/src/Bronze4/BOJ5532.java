package Bronze4;

import java.io.*;

public class BOJ5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int cnt = 0;

        if(a/c<b/d){
            if(b%d==0){
                cnt = b/d;
            }
            else cnt = b/d +1;
        }
        else if(a/c>b/d){
            if(a%c==0){
                cnt = a/c;
            }
            else cnt = a/c +1;
        }
        else if(a/c==b/d){
            if(a%c==0){
                cnt = a/c;
            }
            else cnt = a/c + 1;
        }

        int answer = l-cnt;

        br.close();
        bw.write( answer +"");
        bw.flush();
        bw.close();

    }
}
