package Tier.Silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11053_ing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 1;
        int start = 0;
        int end = start + 1;
        int index = 0;

        for (int i=0; i<n-1; i++) {
            if (arr[start] < arr[end + index]) {
                start++;
                cnt++;
                index = 0;
            } else {
                end++;
            }
        }
        System.out.println(cnt);

//        int cnt = 0;
//        int index = 1;
//        for (int i=0; i<n-1; i++) {
//            if(arr[i] < arr[i + index]) {
//                cnt++;
//                index = 1;
//            }
//            else {
//                index++;
//            }
//        }

        //System.out.println(cnt);
    }
}
