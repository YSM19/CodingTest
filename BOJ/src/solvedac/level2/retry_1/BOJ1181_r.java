package solvedac.level2.retry_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String o1, String o2) {
                // 단어 길이가 같을 경우
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else
                    return o1.length() - o2.length();
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);

    }
}
