package Brnz2;

import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] arr = new int[26];

        for (int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        int index = 0;

        for (int c : s.toCharArray()){
            if(arr[c-'a']!=-1){
                index++;
                continue;
            }
            else {
                arr[c - 'a'] = index;
                index++;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
