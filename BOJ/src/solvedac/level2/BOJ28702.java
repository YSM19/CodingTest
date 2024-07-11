package solvedac.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=3; i>0; i--) {
            String s = br.readLine();
            try {
                int n = Integer.parseInt(s) + i;
                if (n % 3 == 0) {
                    if (n%5==0) {
                        System.out.println("FizzBuzz");
                    }
                    else
                        System.out.println("Fizz");
                } else if (n%5==0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(n);
                }
                return;
            } catch (Exception e) {
                // 입력이 정수가 아닌 경우 다음 입력을 시도
            }
        }
    }
}

//package solvedac.level2;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BOJ28702 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i=3; i>0; i--) {
//            String s = br.readLine();
//            boolean isNumber = true;
//            for (int j=0; j<s.length(); j++) {
//                if (!Character.isDigit(s.charAt(j))) {
//                    isNumber = false;
//                    break;
//                }
//            }
//            if (isNumber) {
//                int n = Integer.parseInt(s) + i;
//                if (n % 3 == 0) {
//                    if (n%5==0) {
//                        System.out.println("FizzBuzz");
//                    }
//                    else
//                        System.out.println("Fizz");
//                } else if (n%5==0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(n);
//                }
//                return;
//            }
//        }
//    }
//}

// ----

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BOJ28702 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i=3; i>0; i--) {
//            String s = br.readLine();
//            if (s.matches("-?\\d+(\\.\\d+)?")) {
//                int n = Integer.parseInt(s) + i;
//                if (n % 3 == 0) {
//                    if (n%5==0) {
//                        System.out.println("FizzBuzz");
//                    }
//                    else
//                        System.out.println("Fizz");
//                } else if (n%5==0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(n);
//                }
//                return;
//            }
//        }
//    }
//}
