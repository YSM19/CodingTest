package Bronze5.sec02;

import java.util.Scanner;

public class BOJ10807_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int result = 0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i=0; i<n; i++){
            if(arr[i]==v)
                result += 1;
        }
        System.out.println(result);
    }
}
