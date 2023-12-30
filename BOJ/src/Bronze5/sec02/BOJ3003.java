package Bronze5.sec02;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,8};
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<6; i++) {
            int n = sc.nextInt();
            int result = a[i] - n;
            System.out.print(result+ " ");
        }
    }
}
