package Bronze5.sec03;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (char x : str.toCharArray()){
            if(Character.isUpperCase(x)){
                result += Character.toLowerCase(x);
            }
            else {
                result += Character.toUpperCase(x);
            }
        }
        System.out.println(result);

    }
}
