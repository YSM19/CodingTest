package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();

                if(map.containsKey(kind))
                    map.put(kind, map.get(kind)+1);
                else {
                    map.put(kind, 1);
                }
            }
            int res = 1;

            for (int val : map.values()) {
                res *= (val+1);
            }

            sb.append(res-1).append("\n");
        }
        System.out.println(sb);





















//        while(T-- > 0) {
//            HashMap<String, Integer> map = new HashMap<>();
//
//            int n = Integer.parseInt(br.readLine());
//            StringTokenizer st;
//
//            while (n-- > 0){
//                st = new StringTokenizer(br.readLine());
//                st.nextToken();
//
//                String kind = st.nextToken();
//
//                if (map.containsKey(kind)) {
//                    map.put(kind, map.get(kind)+1);
//                }
//                else {
//                    map.put(kind, 1);
//                }
//            }
//
//            int res = 1;
//            for (int val : map.values()) {
//                res *= (val+1);
//            }
//            sb.append(res - 1).append("\n");
//        }
//        System.out.println(sb);
    }
}
