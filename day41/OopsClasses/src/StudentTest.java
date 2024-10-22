class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1+m2+m3;
    }

    public float average() {
        return (float)total()/3;
    }

    public char grade() {
        if(average() >= 90)
            return 'A';
        else if(average() >= 80 && average() < 90)
            return 'B';
        else 
            return 'C';
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Rahul";
        st1.roll = 1001;
        st1.course = "Science";
        st1.m1 = 79;
        st1.m2 = 85;
        st1.m3 = 89;

        System.out.println("Total marks: " + st1.total());
        System.out.println("Average marks: " + st1.average());
        System.out.println("Grade: " + st1.grade());
    }
}
