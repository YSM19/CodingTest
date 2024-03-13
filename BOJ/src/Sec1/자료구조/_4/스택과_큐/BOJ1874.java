package Sec1.자료구조._4.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력할 결과물 저장

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int start = 0;

        while (n-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                // start + 1 부터 입력받은 value까지 push를 한다.
                for (int i=start+1; i<=value; i++){
                    stack.push(i);
                    sb.append('+').append('\n'); // +를 저장
                }
                start = value; // 다음 push 할때의 오름차순을 유지하기 위한 변수 초기화
            }

            // top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if (stack.peek() != value){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
