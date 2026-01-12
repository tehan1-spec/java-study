package day1;

public class DataTypes {
    public static void main(String[] args) {
        //정수형
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2137567878;
        long longVar = 923492539235923123L;
        System.out.println("=== 정수형 ===");
        System.out.println("byte:" + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);

        //실수형
        float floatVar = 3.14f;
        double doubleVar = 3.1415926535;
        System.out.println("\n=== 실수헝 ===");
        System.out.println("float:" + floatVar);
        System.out.println("double: " + doubleVar);

        //문자형
        char charVar = 'A';
        char koreanVar = '가';
        System.out.println("\n=== 문자형 ===");
        System.out.println("char: " + charVar);
        System.out.println("한글: " + koreanVar);

        //논리형
        boolean isJavaFun = true;
        boolean isHard = false;
        System.out.println("\n=== 논리형 ===");
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isHard: " + isHard);
    }
}
