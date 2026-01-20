package day6;

public class BankAccountTest {
    public static void main(String[] args) {

        // 1. 계좌 객체 2개 생성 (홍길동, 김철수)
        System.out.println("=== 1. 계좌 생성 ===");
        BankAccount acc1 = new BankAccount("홍길동", "123-456-789");
        BankAccount acc2 = new BankAccount("김철수", "987-654-321");

        acc1.showInfo();
        acc2.showInfo();

        // 2. 입금 테스트 (홍길동에게 10만원 입금)
        System.out.println("\n=== 2. 입금 테스트 ===");
        acc1.deposit(100000);

        // 3. 출금 테스트 (홍길동 계좌에서 출금)
        System.out.println("\n=== 3. 출금 테스트 ===");
        acc1.withdraw(30000); // 정상 출금 (잔액 7만원 남음)
        acc1.withdraw(80000); // 잔액 부족 테스트 (실패해야 함)

        // 4. 이체 테스트 (홍길동 -> 김철수에게 2만원 이체)
        // 주의: 작성해주신 메서드 이름이 tranfer 입니다 (transfer 오타 그대로 사용)
        System.out.println("\n=== 4. 이체 테스트 ===");
        acc1.transfer(acc2, 20000);

        // 5. 최종 상태 확인
        System.out.println("\n=== 5. 최종 계좌 정보 ===");
        acc1.showInfo(); // 홍길동: 70,000 - 20,000 = 50,000원 예상
        acc2.showInfo(); // 김철수: 0 + 20,000 = 20,000원 예상
    }
}
