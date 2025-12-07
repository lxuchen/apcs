import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        String ageStr = input.nextLine();

        int age = Integer.parseInt(ageStr);

        System.out.printf("Name: %s, Age: %d\n", name, age);

        input.close();
    }
}