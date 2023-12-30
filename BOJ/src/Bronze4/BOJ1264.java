package Bronze4;

import java.io.*;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            int cnt = 0;

            if(str.charAt(0)=='#') break;

            for (int i=0; i<str.length(); i++){
                char compare = Character.toLowerCase(str.charAt(i));

                if(compare=='a'||compare=='e'||compare=='i'
                        ||compare=='o'||compare=='u') {
                    cnt += 1;
                }
            }
            bw.write(cnt+"\n");
            bw.flush();

        }
    }
}
