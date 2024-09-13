package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int start = 0;

        Stack<Integer> stack = new Stack<>();
        while(n-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            }

            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}