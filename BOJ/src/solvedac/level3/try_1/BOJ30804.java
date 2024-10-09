package solvedac.level3.try_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ30804 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];

        // 입력값들을 순차적으로 입력, 과일 정수배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        // 두종류의 과일을 세기위한 fruitsCnt HashMap 선언
        HashMap<Integer, Integer> fruitsCnt = new HashMap<>();
        // 연속된 최대길이를 저장하는 maxLength 변수
        int maxLength = 0;
        // 투포인터에서 왼쪽 포인터를 담당하는 left변수
        int left = 0;

        // fruitsCnt map에 과일 정보 저장
        for(int right = 0; right < N; right++) {
            // 오른쪽 포인터로 과일 추가
            fruitsCnt.put(fruits[right], fruitsCnt.getOrDefault(fruits[right], 0) + 1);

            // 두종류의 과일만 사용 -> Map의 크기가 2 이상이고
            // 과일 종류가 2종류를 초과하면 왼쪽 포인터를 이동하며 처리
            while (fruitsCnt.size() > 2) {
                fruitsCnt.put(fruits[left], fruitsCnt.get(fruits[left]) - 1);

                // map에서 value가 0이면 사용하지 않는것이므로 제거
                // 왼쪽포인터인 left를 통해 왼쪽부터 하나씩 제거
                if (fruitsCnt.get(fruits[left]) == 0) {
                    fruitsCnt.remove(fruits[left]);
                }
                // 왼쪽 포인터를 오르쪽으로 한칸 이동
                left++;
            }
            // maxLength를 최대 길이로 갱신
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }

}
