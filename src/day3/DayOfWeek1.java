package day3;

public class DayOfWeek1 {
    public static void main(String[] args) {
        int day = 5;

        String dayName = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 입력";
        };

        System.out.println(dayName);
    }
}
