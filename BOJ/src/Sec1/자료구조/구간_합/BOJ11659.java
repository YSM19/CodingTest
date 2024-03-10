package Sec1.자료구조.구간_합;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] s = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for (int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            s[i] = s[i-1]+arr[i];
        }
        // 0 5 4 3 2 1
        for (int j=0; j<m; j++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(s[y]-s[x-1]);
        }
    }
}
