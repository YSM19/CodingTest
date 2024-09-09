package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (!stack.isEmpty() && stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }

            }
            if (!stack.isEmpty()) {
                sb.append("NO\n");
            }
            else {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}
