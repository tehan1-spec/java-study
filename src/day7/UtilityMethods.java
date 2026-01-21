package day7;

import java.util.Arrays;

public class UtilityMethods {
    public static void main(String[] args) {
        int[] numbers = {85, 92, 78, 96, 88}; // 배열 생성

        System.out.println("=== 배열 유틸리티 ===");
        System.out.print("배열: ");
        printArray(numbers);  // printArray 메서드에 numbers 배열 넣기

        System.out.println("합계: " + sum(numbers));
        System.out.println("평균: " + average(numbers));
        System.out.println("최대값: " + max(numbers));
        System.out.println("최소값: " + min(numbers));

        System.out.println("\n=== 숫자 판별 ===");
        System.out.println("10은 짝수? " + isEven(10));
        System.out.println("17은 소수? " + isPrime(17));
    }

    // 배열 관련 메서드
    public static void printArray(int[] arr) {  // 배열의 모든 요소를 출력하는 메서드
        for (int num : arr) {      // arr의 요소를 처음부터 끝까지 하나씩 꺼내 num에 담기
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {  // 배열의 요소를 하나씩 꺼내서
            total += num;
        }
        return total;
    }

    // 평균을 구하는 메서드
    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
        // sum(arr)을 호출 합계를 먼저 구함 (코드 재사용)
        // (double)을 붙여 합계를 실수로 변환
        // 배열의 길이(arr.length)로 나눔
    }

    public static int max(int[] arr) {
        int maxVal = arr[0];     // 배열의 첫 번째 값이 가장 크다고 가정
        for (int num : arr) {    // 배열의 모든 숫자를 하나씩 가져옴
            if (num > maxVal) maxVal = num;  // 가져온 숫자가 maxVal보다 크면 1등을 num 으로 바꿈
        }
        return maxVal;      // 가장 큰 수를 반환
    }

    public static int min(int[] arr) {
        int minVal = arr[0];
        for (int num : arr) {
            if (num < minVal) minVal = num;
        }
        return minVal;
    }

    // 숫자 판별 메서드
    // 짝수 판별 메서드
    public static boolean isEven(int n) {
        return n % 2 == 0;  // 나머지가 0이면 true 반환 아니면 false
    }

    // 소수 판별 메서드
    public static boolean isPrime(int n) {
        if (n < 2) return false;  // 0과 1은 소수 x 바로 false 처리
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
