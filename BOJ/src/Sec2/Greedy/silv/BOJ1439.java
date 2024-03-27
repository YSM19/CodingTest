package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double cnt = 0;
        //int cnt_1 = 0;

        int[] arr = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i=0; i<s.length()-1; i++) {
            //for (int j=i+1; j<s.length(); j++) {
                if(arr[i] != arr[i+1]) {
                    cnt++;
                }
        }

        System.out.println((int)Math.ceil(cnt/2));

    }
}
