package Brnz2;

import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] temp = new int[10];

        for (int i=0; i<10; i++){
            int n = sc.nextInt();
                if (temp[i]==n) {

                    if (n%42!=0){
                    temp[cnt] = n;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
