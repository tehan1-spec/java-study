package day4;

public class Star5 {
    public static void main(String[] args) {
        int n = 5;

        // 다이아몬드

        // 위쪽 피라미드 1 3 5 7 9 순서
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        // 아래쪽 역피라미드 7 5 3 1 순서
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
