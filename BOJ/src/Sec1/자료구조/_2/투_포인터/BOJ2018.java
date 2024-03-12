package Sec1.자료구조._2.투_포인터;

import java.util.Scanner;

public class BOJ2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int cnt = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != n) {
            if (sum==n) {
                cnt++; end_index++; sum+=end_index;
            } else if (sum>n) {
                sum -= start_index;
                start_index++;
            }
            else {
                end_index++; sum+=end_index;
            }
        }

        System.out.println(cnt);
    }
}
