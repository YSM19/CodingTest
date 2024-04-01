package src;

import java.util.*;

//public class ex {
//    public static void main(String[] args) {
//        String s = "1 2 3 4";
//        StringTokenizer st = new StringTokenizer(s);
//
//        int[] arr = new int[s.length()];
//        for(int i=0; i<s.length(); i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//    }
//}



class Solution {
    public String solution(/*String s*/) {

        String s = "1 2 3 4";
        String answer = "";

        int[] arr = new int[s.length()];
        StringTokenizer st = new StringTokenizer(s);

        for(int i=0; i<s.length(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            //System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);

        answer += arr[0];
        answer += arr[s.length()-1];

        return answer;
    }
}
