package Bronze3.Day1;

import java.io.*;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        String n2 = br.readLine();

        int n3 = n1 * Integer.parseInt(n2.charAt(2)+"");
        int n4 = n1 * Integer.parseInt(n2.charAt(1)+"");
        int n5 = n1 * Integer.parseInt(n2.charAt(0)+"");
        int n6 = n1 * Integer.parseInt(n2);

        bw.write(n3+"\n"+n4+"\n"+n5+"\n"+n6);
        bw.flush();

    }
}
