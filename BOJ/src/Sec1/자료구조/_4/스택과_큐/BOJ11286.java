package Sec1.자료구조._4.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2)-> {

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) { // 절댓값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs; // 절댓값 작은 데이터 우선
        });

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                if (q.isEmpty()){
                    System.out.println(0);
                }
                for (int j=0; j<q.size(); j++) {
                    System.out.println(q.poll());
                }
            }
            else {
                q.add(num);
            }
        }
    }
}
