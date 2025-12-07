import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = myNumber.nextInt();
        System.out.println("The square of number: " + n + " is: " + mySquare(n));
    }

    public static int mySquare(int num) {
        return num * num;
    }
}