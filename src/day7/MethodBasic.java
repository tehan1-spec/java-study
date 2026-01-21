package day7;

public class MethodBasic {
    public static void main(String[] args) {

        // 메서드 호출
        greet();
        greet("홍길동");

        // 반환값 사용
        int sum = add(10, 20);
        System.out.println("합계: " + sum);

        // 직접 출력
        System.out.println("곱셈: " + multiply(5, 6));
    }

    // 매개변수 없음, 반환값 없음
   public static void greet() {
       System.out.println("안녕하세요!");
   }

    // 매개변수 있음, 반환값 없음 (오버로딩)
    public static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 매개변수 있음, 반환값 있음
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
