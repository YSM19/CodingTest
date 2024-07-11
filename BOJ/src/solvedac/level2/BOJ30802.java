package solvedac.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for (int i=0; i<6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tcount = 0;
        for (int i=0; i<6; i++) {
            int num = arr[i];
            if (num > 0) {
                tcount += num/T +1;
                if (num%T==0) tcount-=1;
            }
        }

        System.out.println(tcount);
        System.out.println(N/P+" "+N%P);

    }
}
