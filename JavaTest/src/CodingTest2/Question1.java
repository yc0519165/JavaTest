package CodingTest2;

public class Question1 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1; i<=n; i++){
            for (int j = 1; j < n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.print(i + " ");
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
