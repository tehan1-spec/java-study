package day4;

public class BreakContinue {
    public static void main(String[] args) {

        // break : 특정 값 찾기
        System.out.println("=== 특정 값 찾기 ===");
        int target = 7;

        for (int i = 1; i <= 10; i++) {
            if (i == target) {
                System.out.println("🎯 " + target + " 찾음! 종료");
                break;
            }
            System.out.println("검색 중: " + i);
        }

        // continue 짝수만 출력
        System.out.println("\n=== continue: 짝수만 ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;     // 홀수 건너뜀
            System.out.print(i + " ");
        }

        // 3의 배수 제외
        System.out.println("\n\n=== continue: 짝수만 ===");
        for (int i =1; i <= 15; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
