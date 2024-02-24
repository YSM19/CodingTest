package Bronze3.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n1==0&&n2==0) break;

            if (n1 > n2) {
                if (n1 % n2 == 0){
                    System.out.println("multiple");
                }
                else {
                    System.out.println("neither");
                }
            } else if (n1 < n2) {
                if (n2 % n1 == 0) {
                    System.out.println("factor");
                }
                else {
                    System.out.println("neither");
                }
            }
        }
    }
}
