package CodingTest2;

public class Question3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "  ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }
}
