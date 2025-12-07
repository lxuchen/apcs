import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayianCalculator {

    /*
     * Do NOT change the code below, it is for testing purposes
     * you may add code in the first block in the main method to test your methods
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        if (testCase == 0) {
            /*
             * use this block to test out your code:
             * type your test code, hit the run button, type 0
             */

        } else if (testCase == 1) {
            System.out.println(add(2, 3));
            System.out.println(add(3, 2));
            System.out.println(add(10, 10));
            System.out.println(add(3.5, 2));
            System.out.println(add(1234.56, 1));
            System.out.println(add(0, 12.25));
            System.out.println(add(0, -12.25));
            System.out.println(add(0, 0));
            System.out.println(add(10.2, 1.25));
            System.out.println(add(-3.5, 2.75));
            System.out.println(add(3.5, -2.75));
            System.out.println(add(-3.5, -2.75));

        } else if (testCase == 2) {

            System.out.println(subtract(2, 3));
            System.out.println(subtract(3, 2));
            System.out.println(subtract(10, 10));
            System.out.println(subtract(3.5, 2));
            System.out.println(subtract(3.5, 0));
            System.out.println(subtract(1234.56, 1));
            System.out.println(subtract(10.2, 1.25));
            System.out.println(subtract(-3.5, 2.75));
            System.out.println(subtract(3.5, -2.75));
            System.out.println(subtract(-3.5, -2.75));

        } else if (testCase == 3) {
            System.out.println(multiply(2, 3));
            System.out.println(multiply(3, 2));
            System.out.println(multiply(10, 10));
            System.out.println(multiply(3.5, 2));
            System.out.println(multiply(1234.56, 1));
            System.out.println(multiply(0, 12.25));
            System.out.println(multiply(0, -12.25));
            System.out.println(multiply(0, 0));
            System.out.println(multiply(10.567, 1.25));
            System.out.println(multiply(-3.5, 2.75));
            System.out.println(multiply(3.5, -2.75));
            System.out.println(multiply(-3.5, -2.75));

        } else if (testCase == 4) {
            System.out.println(divide(0, 12.25));
            System.out.println(divide(0, -12.25));
            System.out.println(divide(10, 10));

            System.out.println("tolerance testing");
            double answer1 = divide(3.5, 2);
            double answer2 = divide(10.2, 1.25);
            double answer3 = divide(2, 3);
            double answer4 = divide(3, 2);
            double answer5 = divide(1234.56, 1);
            double answer6 = divide(-3.5, 2.75);
            double answer7 = divide(3.5, -2.75);
            double answer8 = divide(-3.5, -2.75);

            double tolerance = 0.0000000001;
            if (Math.abs(answer1 - 1.3228756555) < tolerance)
                System.out.println("first answer correct");
            if (Math.abs(answer2 - 2.8565713714) < tolerance)
                System.out.println("second answer correct");
            if (Math.abs(answer3 - 0.8164965809) < tolerance)
                System.out.println("third answer correct");
            if (Math.abs(answer4 - 1.2247448713) < tolerance)
                System.out.println("fourth answer correct");
            if (Math.abs(answer5 - 35.1363060095) < tolerance)
                System.out.println("fifth answer correct");
            if (Math.abs(answer6 - 1.1281521496) < tolerance)
                System.out.println("sixth answer correct");
            if (Math.abs(answer7 - 1.1281521496) < tolerance)
                System.out.println("seventh answer correct");
            if (Math.abs(answer8 - 1.1281521496) < tolerance)
                System.out.println("eighth answer correct");

        } else if (testCase == 5) {
            System.out.println(squareRoot(0));
            System.out.println(squareRoot(1));
            System.out.println(squareRoot(16));

            System.out.println("tolerance testing square root");
            double answer1 = squareRoot(1234);
            double answer2 = squareRoot(2.75);
            double answer3 = squareRoot(12.25);
            double answer4 = squareRoot(100.5);

            double tolerance = 0.0000000001;
            if (Math.abs(answer1 - 5.9269162420) < tolerance)
                System.out.println("first answer correct");
            if (Math.abs(answer2 - 1.2877547884) < tolerance)
                System.out.println("second answer correct");
            if (Math.abs(answer3 - 1.8708286933) < tolerance)
                System.out.println("third answer correct");
            if (Math.abs(answer4 - 3.1662231171) < tolerance)
                System.out.println("fourth answer correct");

            System.out.println(square(2.5));
            System.out.println(square(10));

        } else if (testCase == 6) {
            double answer1 = calcDistance(3.9, 2.08, 4.63, 8.2, 3.2339, 5.55);
            double answer2 = calcDistance(11, 11.98, 17.5, 17, 15, 9.41);
            double answer3 = calcDistance(14.8, 19, 17.835, 9.5, 8.98, 4);
            double answer4 = calcDistance(9.5, 8.98, 4, 14.8, 19, 17.835);

            double tolerance = 0.0000000001;
            if (Math.abs(answer1 - 30.4172692887) < tolerance)
                System.out.println("first answer correct");
            if (Math.abs(answer2 - 971.9771601512) < tolerance)
                System.out.println("second answer correct");
            if (Math.abs(answer3 - 1141.4656498403) < tolerance)
                System.out.println("third answer correct");
            if (Math.abs(answer4 - 1141.4656498403) < tolerance)
                System.out.println("fourth answer correct");

        } else if (testCase == 7) {
            double answer1 = calcTrianglePerimeter(1, 4, 7.4, 4.5, 1, 5, 7, 4.8, 1.05);
            double answer2 = calcTrianglePerimeter(7.86, 5.402, 0.25, 4.5, .49, 5.75, 0.8, 4.2, 7.5);

            double tolerance = 0.00000001;
            if (Math.abs(answer1 - 23204.1586507155) < tolerance)
                System.out.println("first answer correct");
            if (Math.abs(answer2 - 5920.7000574475) < tolerance)
                System.out.println("second answer correct");

        } else if (testCase == 8) {
            printMessage(3, 2);
            printMessage(-2.25, 1.75);
            printMessage(0.5, 0.5);
            printMessage(-2.5, -8);

        }
        System.out.println("end of main");
        in.close();
    } // end of main method

    // type your methods here!!
    // don't forget preconditions and postconditions above every method header

    // Precondition: Use add(a, b), and you can choose any double for a and b.
    public static double add(double a, double b) {
        return (a + b) + (a * b);
    }
    /*
     * Postcondition: This method will return the arrayian addition of a
     * and b as a double. Arrayian addition is the sum of a and b multiplied
     * by the product of a and b.
     */

    // Precondition: Use subtract(a, b). You can use any double
    public static double subtract(double a, double b) {
        return Math.abs(a - b) * Math.abs(Math.min(a, b));
    }
    /*
     * Postcondtion: This method returns the Arrayian
     * subtraction of a and b, which is the larger value subtracted by the
     * lower value all multiplied by the lower number.
     */

    // Precondition: Use multiply(a, b) where they are both doubles.
    public static double multiply(double a, double b) {
        return 3 * a * b;
    }
    /*
     * Postcondition: This method returns arrayian multiplication of a
     * and b, which is like multiplication except it is tripled
     */

    // Precondition: Use divide(a, b). The second argument cannot be 0
    public static double divide(double a, double b) {
        return Math.sqrt(Math.abs(a / b));
    }

    /*
     * Postcondtion: This method returns the arrayian multiplication of a
     * and b, which is the square root of the absolute value of a/b *.
     * 
     * /*Precondition: Use squareRoot(a). a can be any number greater than or
     * equal to zero.
     */
    public static double squareRoot(double a) {
        return Math.sqrt(Math.sqrt(a));
    }
    /*
     * Postcondition: This method returns arrayian square root, which is just
     * the fourth root in normal math.
     */

    // Precondition: use square(a) where a can be any double.
    public static double square(double a) {
        return multiply(a, a);
    }
    /*
     * Postcondition: This method will return the arrayian square of a number,
     * which is just the arrayian mutliplication of a and itself
     */

    /*
     * Preconditon: use calcDistance(k0, m0, b0, k1, m1, b1).
     * The arguments can be any double that is valid in the arrayian
     * coordinate system.
     */
    public static double calcDistance(double k0, double m0, double b0, double k1, double m1, double b1) {
        // System.out.println(squareRoot(add(add(square(subtract(k0, k1)),
        // square(subtract(m0, m1))), square(subtract(b0, b1)))));
        return squareRoot(add(add(square(subtract(k0, k1)), square(subtract(m0, m1))), square(subtract(b0, b1))));
    }
    /*
     * Postcondition: This will find the distance between two points
     * in the arrayian planet.
     */

    /*
     * Precondition: Use use calcDistance(k0, m0, b0, k1, m1, b1).
     * The arguments can be any double that is valid in the arrayian
     * coordinate system.
     */
    public static double calcTrianglePerimeter(double k0, double m0, double b0, double k1, double m1, double b1,
            double k2, double m2, double b2) {
        double distanceBetween0and1 = squareRoot(
                add(add(square(subtract(k0, k1)), square(subtract(m0, m1))), square(subtract(b0, b1))));
        double distanceBetween0and3 = squareRoot(
                add(add(square(subtract(k0, k2)), square(subtract(m0, m2))), square(subtract(b0, b2))));
        double distanceBetween2and3 = squareRoot(
                add(add(square(subtract(k1, k2)), square(subtract(m1, m2))), square(subtract(b1, b2))));
        return distanceBetween0and1 + distanceBetween0and3 + distanceBetween2and3;
    }

    /*
     * Postcondition: This will find the perimeter of a triangle
     * made out of three points in the arrayian planet.
     */
    public static String printMessage(double a, double b) {
        DecimalFormat d = new DecimalFormat("0.00");
        return "Using the two values: " + a + " and " + b + "\n The sum is: " + d.format(add(a, b))
                + "\n The difference is: " + d.format(subtract(a, b)) + "\n The product is: " + d.format(multiply(a, b))
                + "\n The quotient is: " + d.format(divide(a, b));
    }

}// end of class