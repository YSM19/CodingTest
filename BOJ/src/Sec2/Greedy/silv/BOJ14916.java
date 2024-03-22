package Sec2.Greedy.silv;

import java.util.Scanner;

public class BOJ14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while (n > 0){
            if (n%5 == 0){
                cnt += n/5;
                break;
            }
            else {
                n -= 2;
                cnt++;
            }
        }
        if (n < 0) cnt = -1;

        System.out.println(cnt);

    }
}
