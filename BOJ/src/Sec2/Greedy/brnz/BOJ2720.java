package Sec2.Greedy.brnz;

import java.util.Scanner;

public class BOJ2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] changesArr = {25, 10, 5, 1};
        int[] cntArr = new int[4];

        for (int i=0; i<t; i++) {
            int c = sc.nextInt();
            for (int j=0; j<changesArr.length; j++) {
                cntArr[j] = c / changesArr[j];
                c %= changesArr[j];
            }
            for (int k=0; k<4; k++)
                System.out.print(cntArr[k] + " ");
            System.out.println();
        }
    }
}
