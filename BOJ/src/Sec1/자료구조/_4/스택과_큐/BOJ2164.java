package Sec1.자료구조._4.스택과_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=n; i++) {
            queue.add(i);
        }

        int ans = 0;
        while (queue.size()!=1) {
            queue.poll();
            queue.add(queue.poll());

        }
        ans = queue.poll();
        System.out.println(ans);
    }
}
