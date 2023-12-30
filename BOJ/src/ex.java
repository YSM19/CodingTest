import java.io.*;
import java.util.StringTokenizer;

public class ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

//        for(int tc=1; tc<=t; t++){
//            st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//        }
        a += (b/60);
        System.out.println(a);
        a += b/60;
        System.out.println(a);

        b+=(c/60);
        System.out.println(b);
        b+=c/60;
        System.out.println(b);



        bw.write(a+"\n");
        bw.write(b+"\n");
        br.close();
        bw.flush();
        bw.close();

    }
}
