class Tv {
    public void switchOn() {
        System.out.println("TV is Switched ON");
    }
    public void changeCannel() {
        System.out.println("TV Channel is Changed");
    }
}

class SmartTv extends Tv {
    @Override
    public void switchOn() {
        System.out.println("Smart TV is Switched ON");
    }
    @Override
    public void changeCannel() {
        System.out.println("Smart TV Channel is Changed");
    }
    public void browse() {
        System.out.println("Smart Tv Browsing");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.switchOn();

        SmartTv st = new SmartTv();
        st.switchOn();

        Tv tv = new SmartTv();
        tv.switchOn();
        tv.changeCannel();
        // tv.browse();

        // SmartTv stv = new Tv();
    }
}
