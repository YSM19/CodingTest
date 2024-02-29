package Brnz2;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int cnt = 0;
        for (int i=0; i<8; i++){
            arr[i] = sc.nextInt();

            if (arr[i]==1+i) cnt++;
            if (arr[i]==8-i) cnt--;
        }

        if (cnt==8) System.out.println("ascending");
        else if (cnt==-8) System.out.println("descending");
        else System.out.println("mixed");

    }
}
