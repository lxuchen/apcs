import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        System.out.printf("This is the number you entered: %d\n", x);
        input.close();
    }
}