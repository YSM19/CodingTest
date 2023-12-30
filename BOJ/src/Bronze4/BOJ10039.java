package Bronze4;

import java.io.*;

public class BOJ10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0;
        int sum = 0;

        for (int i=0; i< 5; i++){
            score = Integer.parseInt(br.readLine());
            if(score < 40){
                score = 40;
            }
            sum += score;
        }

        int answer = sum/5;
        bw.write(answer + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
