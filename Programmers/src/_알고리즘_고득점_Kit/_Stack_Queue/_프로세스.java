package src._알고리즘_고득점_Kit._Stack_Queue;
import java.util.*;
public class _프로세스 {
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : priorities) {
            pq.add(num);
        }

        while(!pq.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if(i == location) {
                        return answer;
                    }

                }
            }
        }

        return answer;
    }
}
