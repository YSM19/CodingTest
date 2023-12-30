package Bronze4;

import java.io.*;

public class BOJ10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        if(a1+a2+a3!=180){
            answer = "Error";
        }

        else {
            if (a1 == 60 && a2 == 60 && a3 == 60) {
                answer = "Equilateral";
            } else if (a1 == a2 || a2 == a3 || a3 == a1) {
                answer = "Isosceles";
            } else if (a1 != a2 || a2 != a3 || a3!=a1) {
                answer = "Scalene";
            }
        }

        br.close();
        bw.write(answer);
        bw.flush();
        br.close();
    }
}
