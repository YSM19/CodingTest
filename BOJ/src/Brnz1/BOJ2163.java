package Brnz1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(n*m-1);

    }
}
