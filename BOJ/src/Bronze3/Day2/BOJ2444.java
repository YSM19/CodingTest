package Bronze3.Day2;

import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i=0; i<n; i++){
            for (int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for (int j=i+1; j>0; j--){
                System.out.print("*");
            }

            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<n-1; i++) {
            for (int j=n; j>=n-i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<n-i-1; j++) {
                System.out.print("*");
            }

            for (int j=0; j<n-i-2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
