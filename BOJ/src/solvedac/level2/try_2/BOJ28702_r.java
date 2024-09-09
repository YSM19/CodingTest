package solvedac.level2.try_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28702_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<3; i++) {
            try {
                int num = Integer.parseInt(br.readLine()) + 3-i;
                if (num%3==0) {
                    if (num%5==0) {
                        System.out.println("FizzBuzz");
                    }
                    else
                        System.out.println("Fizz");
                }
                else if (num%5==0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(num);
                }

            }
            catch (Exception e) {
            }
        }
    }
}