package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1541 {
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split("-");
        for (int i=0; i<str.length; i++) {
            int temp = mySum(str[i]);
            if (i==0) ans = ans+ temp;
            else ans = ans - temp;
        }
        System.out.println(ans);

    }

    private static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for (int i=0; i<temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
