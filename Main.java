import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number : ");
        int input = scanner.nextInt();
        System.out.println();
        questionOne(input);
    }

    public static void questionOne(int number) {

        int temp = number;
        for (int i = 1; i <= 5; i++) {
            int k = temp;
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            temp++;
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            int k = temp;
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            temp++;
            System.out.println();
        }
    }
}