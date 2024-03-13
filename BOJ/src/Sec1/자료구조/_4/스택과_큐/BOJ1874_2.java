package Sec1.자료구조._4.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean res = true;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<a.length; i++){
            int su = a[i];
            if (su >= num) {
                while (su>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int m = stack.pop();
                if (m > su){
                    System.out.println("NO");
                    res = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if (res) System.out.println(sb.toString());

    }
}
