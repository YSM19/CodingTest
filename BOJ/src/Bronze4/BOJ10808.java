package Bronze4;

import java.io.*;

public class BOJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] numArray = new int['z'-'a'+1]; // 26
        String answer = "";

        for(int i=0; i< str.length(); i++){
            int index = str.charAt(i) -'a';
            numArray[index] += 1;
        }

        for (int i=0; i<26; i++){
            answer += numArray[i] +" ";
        }

        bw.write(answer + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
