package day7;

public class StringUtils {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("=== 문자열 유틸리티 ===");
        System.out.println("원본: " + text);
        System.out.println("대문자: " + toUpperCase(text));
        System.out.println("소문자: " + toLowerCase(text));
        System.out.println("길이: " + length(text));
        System.out.println("뒤집기: " + reverse(text));
        System.out.println("공백 개수: " + countSpaces(text));
        System.out.println("'o' 개수: " + countChar(text, 'o'));
    }
    // 문자열 변환 메서드
    public static String toUpperCase(String s) {
        return  s.toUpperCase();
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static int length(String s) {
        return s.length();
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // 문자 세기 메서드
    public static int countSpaces(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') count++;
        }
        return count;
    }

    public static int countChar(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
}
