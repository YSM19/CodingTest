package Brnz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        br.close();

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int totalDays = 0;
        for (int i=0; i<x; i++){
            totalDays += months[i];
        }
        totalDays += y-1;
        System.out.println(days[totalDays%7]);

    }
}
