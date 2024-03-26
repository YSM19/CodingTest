package Sec2.Greedy.brnz;

import java.util.Scanner;

public class BOJ22864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();

        //int ans = 0;
        int curWork = 0;
        int curTired = 0;

        for (int i = 0; i < 24; i++) {
            if (curTired + a <= m) {
                curTired += a;
                curWork += b;
            } else {
                curTired -= c;
                if (curTired < 0) curTired = 0;
            }
        }
        System.out.println(curWork);
    }
}