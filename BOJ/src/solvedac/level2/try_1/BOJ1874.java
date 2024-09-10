package solvedac.level2.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int start = 0;

        while (n-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                // start+1부터 입력받은 value까지 push를 한다.
                for (int i=start+1; i<=value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }

            // top에 있는 원소가 입력받은 값과 같지않은경우
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}