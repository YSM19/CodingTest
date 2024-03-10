package Tier.Bronze4;

import java.io.*;

public class BOJ5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());

        int answer = n1+n2+n3+n4;
        String result = (answer/60) +"\n"+(answer%60);

        br.close();
        bw.write(result+"");
        bw.flush();
        bw.close();

    }
}
