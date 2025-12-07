public class MethodsExample {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with the main.");
    }

    public static void message1() {
        System.out.println("This is message 1.");
    }

    public static void message2() {
        System.out.println("This is message 2.");
        message1();
        System.out.println("Done with message 2.");
    }
}