public class RockTester {
    public static void main(String[] arg) {
        Rock x = new Rock("grey", 2.9);
        Rock y = new Rock();
        Rock z = new Rock("Brown", 6.0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z.toString());
        z.breakInTwo();
        double total = x.getWeight() + y.getWeight() + z.getWeight();
        System.out.println("All J will weigh " + total + " lbs");

    }
}

class Rock {
    private String color;
    private double weight;

    public Rock() {
        color = "";
        weight = 0;
    }

    public Rock(String c, double w) {
        color = c;
        weight = w;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void breakInTwo() {
        weight /= 2;
        System.out.println("CRACK!");
    }

    public String toString() {
        return color + ", " + weight + " lbs";
    }

}