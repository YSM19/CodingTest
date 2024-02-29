package Brnz2;

import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;

        for (char x : s.toCharArray()){
            if ('A'==x||'B'==x||'C'==x) cnt = cnt+3;
            if ('D'==x||'E'==x||'F'==x) cnt = cnt+4;
            if ('G'==x||'H'==x||'I'==x) cnt = cnt+5;
            if ('J'==x||'K'==x||'L'==x) cnt = cnt+6;
            if ('M'==x||'N'==x||'O'==x) cnt = cnt+7;
            if ('P'==x||'Q'==x||'R'==x||'S'==x) cnt = cnt+8;
            if ('T'==x||'U'==x||'V'==x) cnt = cnt+9;
            if ('W'==x||'X'==x||'Y'==x||'Z'==x) cnt = cnt+10;
        }
        System.out.println(cnt);
    }
}
