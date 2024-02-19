package Bronze5.sec04;

import java.util.Scanner;

public class BOJ159684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long ans = (a+b)*(a-b);

        System.out.println(ans);
    }
}
