package solvedac.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String str = br.readLine();

            Stack<Character> stack = new Stack<>();
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                }
                else {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(j));
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }

            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            }
            else System.out.println("NO");

        }

    }
}
