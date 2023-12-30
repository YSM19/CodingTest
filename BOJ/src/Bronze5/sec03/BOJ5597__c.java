package Bronze5.sec03;

import java.util.Scanner;

public class BOJ5597__c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student[] = new int[31];

        for (int i=1; i<=28; i++){
            int input = sc.nextInt();
            student[input] = 1;
        }

        for(int i=1; i<31; i++){
            if(student[i]!=1)
                System.out.println(i);
        }

    }
}
