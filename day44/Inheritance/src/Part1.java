class Circle {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Part1 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.radius = 10;
        c1.height = 20;

        System.out.println(c1.area());
        System.out.println(c1.circumference());

        System.out.println(c1.volume());
        
    }
}
