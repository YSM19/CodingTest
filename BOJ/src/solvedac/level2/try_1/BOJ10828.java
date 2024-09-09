package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String str = br.readLine();
            if (str.length()==3) {
                if(str.equals("pop")){
                    if(stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.pop());
//                        stack.pop();
                    }
                }
                else if(str.equals("top")) {
                    if(stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.peek());
                    }
                }
            }
            else if (str.length()==4) {
//                if(str.equals("size"))
                System.out.println(stack.size());
            }
            else if (str.length() == 5) {
//                if (str.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else System.out.println(0);
//                }
            }

            else {
                StringTokenizer st = new StringTokenizer(str, " ");
                st.nextToken();
                stack.push(Integer.parseInt(st.nextToken()));

//                if (str.substring(0, 4).equals("push"))
//                stack.push((int) str.charAt(5));
            }
        }

    }
}
