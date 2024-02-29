package Brnz2;

import java.io.*;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];

        for(int i=0; i< n; i++){
            arr[i] = br.readLine();
        }

        for (int i=0; i<n; i++) {
            int cnt = 0;
            int ans = 0;

            for (int j=0; j<arr[i].length(); j++){
                if (arr[i].charAt(j)=='O') {
                    cnt++;
                    ans += cnt;
                }
                else cnt=0;
            }
            System.out.println(ans);
        }
    }
}
