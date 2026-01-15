package day4;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║         1 ~ 100 소수 찾기                ║");
        System.out.println("╚════════════════════════════════════════╝");

        int count = 0;      // 출력 개수를 셀 변수

        for (int num = 2; num <= 100; num++) { // 소수인 2부터 시작
            boolean isPrime = true;
            // 플래그 (Flag) 기법 검사 시작 전 숫자가 소수인지 모름 but 로직을 짜려면 기본 상태
            // Default를 정해야 함 -> 일단 소수라고 하자 >> 약수가 나오면 탈락 false
            // 일단은 true로 두고 시작하는 것이 국룰(표준)

            // 소수 판별: 2부터 √num까지 나눠봄
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // sqrt = SQuare RooT(제곱근) 100의 루트인 10까지만 검사해봐
                // 반환점인 √num 까지 나누는 수를 대입하면 나누어 떨어지는지 확인 가능

                if (num % i == 0) {
                    isPrime= false;
                    break;        // 나눠지면 소수  x
                }
            }

            // 소수면 출력
            if (isPrime) {
                System.out.printf("%4d", num);   // 4칸 확보 후 출력
                count++;

                // 10개마다 줄바꿈
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
