package Brnz1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //StringTokenizer st = new StringTokenizer(sc.nextLine());
        double[] arr = new double[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        double num = 0;
        for (int i=0; i<n; i++){
            num += arr[i]/arr[n-1]*100;
        }
        double avg = num/n;

        System.out.println(avg);

    }
}
