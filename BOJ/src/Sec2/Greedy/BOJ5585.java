package Sec2.Greedy;

import java.util.Scanner;

public class BOJ5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int changes = 1000 - n;
        int[] changeArr = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        for (int i=0; i<changeArr.length; i++) {
            cnt += changes/changeArr[i];
            changes = changes % changeArr[i];
        }

        System.out.println(cnt);
    }
}
