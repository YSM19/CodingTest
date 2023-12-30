package Bronze3.Day1;

import java.io.*;
import java.util.Arrays;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num_list = new int[9];
        int[] cpy_list = new int[9];
        int ans=0;

        for (int i=0; i<9; i++){
            num_list[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<9; i++){
            cpy_list[i] = num_list[i];
        }
        Arrays.sort(num_list);
        for (int i=0; i<9; i++) {
            if(cpy_list[i] == num_list[8]){
                ans = i+1;
            }
        }
        bw.write(num_list[8]+"\n"+ans);
        bw.flush();
    }
}
