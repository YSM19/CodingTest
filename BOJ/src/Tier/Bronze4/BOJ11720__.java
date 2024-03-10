package Tier.Bronze4;

import java.io.*;

public class BOJ11720__ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String num = br.readLine();

        int result = 0;

        for (int i=0; i<n; i++) {
            result += Integer.parseInt(String.valueOf(num.charAt(i)));

            //result += num.toCharArray();
            //result += Integer.parseInt(st.nextToken());
        }
        br.close();
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
