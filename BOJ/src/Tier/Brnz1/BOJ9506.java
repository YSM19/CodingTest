package Tier.Brnz1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            if (s.equals("-1")) break;

            int n = Integer.parseInt(s);
            List<Integer> list = new ArrayList<>();
            int ans = 1;
            list.add(0, 0);
            list.add(1, 1);
            for (int i=2; i<n; i++){
                if (n % i == 0){
                    list.add(i);
                    ans += i;
                }
            }
            if (n==ans) {
                System.out.print(n+" = "+ list.get(1));
                for (int i=2; i< list.size(); i++)
                    System.out.print(" + "+list.get(i)); //+" + "+list.get(2)+" + "+list.get(3));
            }
            else System.out.print(n+" is NOT perfect.");

            System.out.println();
        }

    }
}
