package day1;

public class VariablePractice {
    public static void main(String[] args) {

        // === 학생 정보 저장 ===
        String name = "황민규";
        int age = 26;
        double height = 190.0;
        boolean isStudent = true;
        char grade = 'N';

        // ===정보 출력 ===
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);

        // === 값 변경 ===
        age = 27;
        grade = 'B';

        System.out.println("\n=== 1년 후 ===");
        System.out.println("나이: " + age + "살");
        System.out.println("학점: " + grade);
    }
}
