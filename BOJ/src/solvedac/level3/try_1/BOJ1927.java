package solvedac.level3.try_1;

import java.io.*;
import java.util.*;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
//        List<Integer> arr = new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {

            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                if (q.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(q.poll()).append("\n");
                }
            }
            else{
                q.offer(num);
            }
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
