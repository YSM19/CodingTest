package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder(br.readLine());

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            map.put(i, s);
            map2.put(s, i);
        }
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (49 <= sb.charAt(0) && sb.charAt(0) <= 57) {
                sb.append(map.get(Integer.parseInt(input))).append("\n");
            }
            else {
                sb.append(map2.get(input)).append("\n");
            }
        }
        System.out.println(sb);

    }

}
