package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //3
        int m = Integer.parseInt(br.readLine()); //5
        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<n-1; i++){
            arr.add(Integer.parseInt(br.readLine())); // 7 7
        }
        Collections.reverse(arr);

        int ans = 0;
        for (int i=0; i<n-1; i++) {

            int cnt = 0;
            for (int j=0; j<n-1; j++) {
                if ((m > arr.get(j))){
                    cnt++;
                }
            }
            if (cnt == n-1) break;

            arr.set(i, arr.get(i)-1); // 6 7
            m=m+1;
            ans++;
        }
        System.out.println(ans);

    }
}
