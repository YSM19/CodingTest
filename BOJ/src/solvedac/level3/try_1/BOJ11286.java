package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ11286 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               // 절댓값이 앞값이 더 크면 자리 바꿔줌
               if (Math.abs(o1) > Math.abs(o2)) {
                   return Math.abs(o1) - Math.abs(o2);
               }
               // 절댓값 기준으로 두 값이 같으면 음수를 앞으로 보냄
               else if (Math.abs(o1) == Math.abs(o2)) {
                   return o1 - o2;
               }
               else {
                   return -1;
               }
           }
        });

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x==0) {
                if (pq.isEmpty()) sb.append("0").append("\n");
                else sb.append(pq.poll()).append("\n");
            }
            else {
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}
