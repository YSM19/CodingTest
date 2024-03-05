package Brnz1;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String init = n;
        int cnt = 0;

        while (true) {
            String sum = String.valueOf(n.charAt(0) - '0' + n.charAt(1) - '0');
            if (Integer.parseInt(sum)>9) sum = String.valueOf(sum.charAt(1));
            n = n.charAt(1) + "" + sum;
            cnt++;
            if(init.equals(n)) break;
            if(Integer.parseInt(n)<10){
                n = '0'+n;
            }

        }
        System.out.println(cnt);
    }
}
