package Brnz1;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String init = n;
        int cnt = 0;

        while (true) {
            int sum = n.charAt(0) - '0' + n.charAt(1) - '0';

            n = n.charAt(1) + sum + "";
            if(init.equals(n)) break;
            if(Integer.parseInt(n)<10){
                n = '0'+n;
            }
            cnt++;

        }
        System.out.println(cnt);
    }
}
