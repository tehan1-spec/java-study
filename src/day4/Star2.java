package day4;

public class Star2 {
    public static void main(String[] args) {
        int n = 5;

        // 역삼각형     5 4 3 2 1 순서
        for (int i = n; i >= 1; i--) {    //5번째줄
            for(int j = 1; j <= i; j++) {  //j는 5개 찍고
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
