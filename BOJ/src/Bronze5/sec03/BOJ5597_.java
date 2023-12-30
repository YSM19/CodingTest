package Bronze5.sec03;

import java.util.Scanner;

public class BOJ5597_ {
    public static void main(String[] args) {
        int[] student = new int[31];
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<29; i++){
            int index = sc.nextInt();
            student[index] = 1;
        }
        for (int i=1; i<student.length; i++) {
            if (student[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
