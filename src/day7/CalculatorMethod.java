package day7;

public class CalculatorMethod {
    public static void main(String[] args) {
        int a = 20, b = 7;

        System.out.println("=== 계산기 ===");
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " / " + b + " = " + divide(a, b));

        // 오버로딩 테스트
        System.out.println("\n=== 오버로딩 ===");
        System.out.println("int 2개: " + add(1, 2));
        System.out.println("double 2개: " + add(1.5, 2.5));
        System.out.println("int 3개: " + add(1, 2, 3));
    }

    // 기본 사칙연산
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    // 오버로딩
    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
