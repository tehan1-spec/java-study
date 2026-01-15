package day4;

public class Star1 {
    public static void main(String[] args) {

        int n = 5;        // 1 2 3 4 5 순서대로

        //직각 삼각형   i:줄 j:그 줄의 몇번째 *
        for (int i = 1; i <= n; i++) {        // i -> 1부터 5까지
            for(int j = 1; j <= i; j++) {     // j=1 >> 첫번째 별부터 찍고 옆으로 간다
                System.out.print("*");        //print 로 줄바꿈 x
            }
            System.out.println();
        }
    }
}
