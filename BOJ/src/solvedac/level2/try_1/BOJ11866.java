package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i=1; i<N+1; i++) {
            list.add(i);
        }

        int index = 0;
        while (N > 1) {
            index = index+K-1;
            index %= N;
            sb.append(list.remove(index)).append(", ");
            N--;
        }

        sb.append(list.remove()).append('>');
        System.out.println(sb);

    }
}
