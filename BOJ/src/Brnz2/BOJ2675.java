package Brnz2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (char x: s.toCharArray()){
                for (int j=0; j<r; j++){
                    System.out.print(x);
                }
            }
            System.out.println();

        }

    }
}
