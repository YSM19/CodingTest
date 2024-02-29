package Brnz2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int cnt = 0;
        int num;

        for (int i=0; i<10; i++){
            num = Integer.parseInt(br.readLine()) % 42;
            if (!arr[num]){
                arr[num] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
