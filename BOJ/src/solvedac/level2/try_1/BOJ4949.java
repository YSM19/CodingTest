package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<Character> stack = new Stack<>();
            stack.push('0');
            Character last = 0;

            String s = br.readLine();
            if (s.equals(".")) break;

            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c=='(' || c==')' || c=='[' || c==']') {
                    Character s1 = c;
                    last = s1;
                    if ((last == ')' && stack.peek()=='(') || (last == ']' && stack.peek()=='['))
                        stack.pop();
                    else stack.push(c);
//                    System.out.println(stack);
                }
            }
            if(stack.peek()=='0'){
                System.out.println("yes");
            }
            else System.out.println("no");
        }

    }
}
