package Bronze5.sec02;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;

        for (int i=1; i<=n; i++){
            res *= i;
        }
        System.out.print(res);
    }
}
