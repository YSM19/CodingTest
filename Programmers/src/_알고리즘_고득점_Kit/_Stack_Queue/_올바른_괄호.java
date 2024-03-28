package src._알고리즘_고득점_Kit._Stack_Queue;
import java.util.*;
public class _올바른_괄호 {
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(char item: s.toCharArray()) {
            if(item == '(') {
                stack.push('(');
            }
            else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else
                    return false;
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
