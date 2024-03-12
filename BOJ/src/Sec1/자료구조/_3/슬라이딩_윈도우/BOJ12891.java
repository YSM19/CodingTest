package Sec1.자료구조._3.슬라이딩_윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891 {
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int res = 0;
        checkArr = new int[4]; // 충족해야할 ACGT 조건
        myArr = new int[4]; // 내 배열
        char[] a = new char[s];
        checkSecret = 0; // 몇 개가 부분문자열에 만족하는지

        a = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++; // 0이라면 이미 조건을 만족한거나 다름없음
            }
        }

        for (int i=0; i<p; i++) { // 부분 문자열 처음 받을때 세팅, 슬라이딩윈도우 처음 상태
            Add(a[i]);
        }

        if (checkSecret == 4) res++; // 4가지 조건이 다 만족하면 ++

        // 슬라이딩 윈도우 (1칸 이동한 상태)
        for (int i=p; i<s; i++){ // i는 슬라이딩 윈도우 가장 끝 부분
            int j = i-p; // j는 슬라이딩 윈도우 가장 앞부분
            Add(a[i]);
            Remove(a[j]);
            if (checkSecret == 4) res++;
        }

        System.out.println(res);
        br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }

    }
}
