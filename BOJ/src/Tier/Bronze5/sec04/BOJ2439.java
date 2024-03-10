package Tier.Bronze5.sec04;

public class BOJ2439 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            for (int j = 4; j>=0; j--) {
                System.out.print("");
            }
            for (int k=1; k<=5; k++)
                System.out.println("*");
        }
    }
}
