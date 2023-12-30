package Bronze5.sec03;

import java.util.Scanner;

public class BOJ2744_ {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        String result = "";

        for(char n : str.toCharArray()){
            if(Character.isUpperCase(n)){
                result += Character.toLowerCase(n);
            }
            else if(Character.isLowerCase(n)){
                result += Character.toUpperCase(n);
            }
        }
        System.out.println(result);
    }
}
