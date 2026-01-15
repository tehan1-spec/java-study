package day4;

public class Multiplication {
    public static void main(String[] args) {

        // 특정 단 출력
        int dan = 7;

        System.out.println("=== " + dan + "단 ===");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "x" + i + " = " + (dan * i));
        }

        // 전체 구구단 2단 ~ 9단
        for (int a = 2; a <= 9; a++) {         //단
            System.out.println("[ " + a + "단 ]");

            for (int b = 1; b <= 9; b++) {           //곱하는 수
                System.out.println(a + " x " + b + " = " + (a * b));
            }
            System.out.println();
        }
    }
}
