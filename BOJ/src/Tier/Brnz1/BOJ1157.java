package Tier.Brnz1;

import java.io.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for (int i=0; i<s.length(); i++){
            int num = s.charAt(i) - 'A';
            arr[num]++;
        }

        int max = 0;
        char ans = '?';
        for (int i=0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                ans = (char) (i+'A');
            } else if (max == arr[i]) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}
