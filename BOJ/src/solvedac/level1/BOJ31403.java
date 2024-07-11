package solvedac.level1;

import java.util.Scanner;

public class BOJ31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        String str = "";

        str = A + B;
        int sec = Integer.parseInt(str) - Integer.parseInt(C);
        int fir = Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C);

        System.out.println(fir);
        System.out.println(sec);
    }

}
