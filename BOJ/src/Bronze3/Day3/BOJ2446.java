package Bronze3.Day3;

import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n * 2 -1;
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            for (int j=0; j<N-2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<n-1; i++){
            for (int k=0; k<n-2-i; k++){
                System.out.print(" ");
            }
            for (int j=N-2*i-1; j<=N+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
