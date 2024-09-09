package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1966_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            //Queue 만들기
            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            // 초기 위치, 중요도 저장
            for (int i=0; i<N; i++) {
                q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            // 출력 횟수
            int cnt = 0;

            // 한 케이스에 대한 반복문
            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                // 큐에 남아있는 원소들과 중요도 비교
                for (int i=0; i<q.size(); i++) {
                    // 처음 뽑은 원소보다 큐에 남아있는 원소가 중요도가 크면
                    if (front[1] < q.get(i)[1]) {
                        // 뽑은 원소 및 i이전의 원소들을 뒤로 보내기
                        q.offer(front);

                        for (int j=0; j<i; j++) {
                            q.offer(q.poll());
                        }

                        // front의 원소가 가장 큰 원소가 아니면 false 후 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아니면 다른 반복문으로 넘어감
                if (isMax == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소이므로 해당 문서를 출력해야함
                cnt++;
                if (front[0] == M) { // 찾고자 하는 문서면 테스트 케이스 종료
                    break;
                }
            }

            sb.append(cnt).append('\n');

        }
        System.out.println(sb);
    }
}
