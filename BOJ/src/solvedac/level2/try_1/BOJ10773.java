package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (i==0) continue;
                else list.remove(list.size()-1);
            }
            else list.add(n);
        }

        int ans = 0;
        for (int i=0; i<list.size(); i++) {
            ans += list.get(i);
        }
        System.out.println(ans);

    }
}
