package Sec2.Greedy.silv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //3
        int a = Integer.parseInt(br.readLine()); //5
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while (n-- > 1){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        while (!pq.isEmpty() && pq.peek() >= a) {
            cnt++;
            a++;
            pq.add(pq.poll()-1);
        }
        System.out.println(cnt);

    }
}
