package Bronze5.sec0;

import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if(90 <= s && s <= 100)
            System.out.print("A");
        else if(80 <= s && s <= 89)
            System.out.print("B");
        else if(70 <= s && s <= 79)
            System.out.print("C");
        else if(60 <= s && s <= 69)
            System.out.print("D");
        else
            System.out.print("F");
    }
}
