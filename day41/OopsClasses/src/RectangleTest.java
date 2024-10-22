class RectangleDH {
    private double length;
    private double breadth;

    // getters
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }

    // setters
    public void setLength(double l) {
        length = l;
    }
    public void setBreadth(double b) {
        breadth = b;
    }

    public double area() { return getLength() * getBreadth(); }
    public double perimeter() { return 2 * ( getLength() + getBreadth() ); }
}

public class RectangleTest {
    public static void main(String[] args) {

        RectangleDH r1 = new RectangleDH();
        r1.setLength(10);
        r1.setBreadth(5);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        
    }
}
