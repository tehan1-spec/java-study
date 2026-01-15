package day4;

public class Star3 {
    public static void main(String[] args) {
        int n = 5;

        //직각삼각형 (오른쪽정렬)  >> 왼쪽 공백 필요

        for (int i = 1; i <= n; i++) {
            // 공백 출력 -> 전체칸 n - 별 개수 i 만큼 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 i 개수만큼 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}