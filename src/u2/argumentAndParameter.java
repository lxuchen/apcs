public class argumentAndParameter {
    public static void main(String args[]) {
        int num = 1;
        myMethod(num);
        System.out.println("in main method: " + num);
    }

    public static void myMethod(int num) {
        num = 2;
        System.out.println("In method: " + num);
    }
}