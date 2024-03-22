package Sec2.Greedy.brnz;

import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] timeArr = {300, 60, 10};
        int[] ansArr = new int[3];
        int ans = 0;

        for (int i=0; i<3; i++) {
            ansArr[i] = t / timeArr[i];
            t %= timeArr[i];
        }
        if (t != 0) System.out.println(-1);
        else {
            for (int j = 0; j < 3; j++) {
                System.out.print(ansArr[j] + " ");
            }
        }
    }
}
