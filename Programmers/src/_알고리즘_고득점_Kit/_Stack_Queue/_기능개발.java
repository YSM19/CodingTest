package src._알고리즘_고득점_Kit._Stack_Queue;

import java.util.*;

public class _기능개발 {
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        //int index = 0;
        for(int i=0; i<progresses.length; i++) {
            q.add((int)Math.ceil((100.0-progresses[i]) / speeds[i]));
        }

        while(!q.isEmpty()) {
            int minDays = q.poll();

            int cnt = 1;

            while(!q.isEmpty() && q.peek() <= minDays) {
                q.poll();
                cnt++;
            }

            list.add(cnt);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}