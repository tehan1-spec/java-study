package day4;

public class Star4 {
    public static void main(String[] args) {
        int n = 5;

        // 피라미드 1 3 5 7 9 순서대로 + 공백 필요
        for (int i = 1; i <= n; i++) {
            // 공백 n-i개
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 (2*i - 1)홀수 개
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
