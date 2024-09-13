package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st;

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    if (set.contains(Integer.parseInt(st.nextToken()))) {
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }
                    break;
                case "toggle":
                    int num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) {
                        set.remove(num);
                    }
                    else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j=0; j<20; j++) {
                        set.add(j+1);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }

        }

    }
}
