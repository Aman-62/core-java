class Super {
    public void display() {
       System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub Class Display");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();

        Sub sb = new Sub();
        sb.display();

        Super sup = new Sub();
        sup.display();

        // Sub sub = new Super(); // not allowed
    }
}
