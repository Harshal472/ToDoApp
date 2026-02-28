// Parent class
class Student {
    int rno;
    String name;

    Student(int r, String n) {
        rno = r;
        name = n;
    }

    void show() {
        System.out.println("Roll No : " + rno);
        System.out.println("Name    : " + name);
    }
}

// Child class
class Test extends Student {
    int sub1, sub2;

    Test(int r, String n, int s1, int s2) {
        super(r, n);   // calling parent constructor
        sub1 = s1;
        sub2 = s2;
    }

    void display() {
        System.out.println("Subject 1 Marks : " + sub1);
        System.out.println("Subject 2 Marks : " + sub2);
    }
}

// Grandchild class
class Result extends Test {
    int total;
    double percentage;

    Result(int r, String n, int s1, int s2) {
        super(r, n, s1, s2);   // calling Test constructor
    }

    void cal_result() {
        total = sub1 + sub2;
        percentage = (total / 200.0) * 100;

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
    }
}

// Main class
public class Demo {
    public static void main(String[] args) {
        Result r1 = new Result(10, "Rutika", 80, 88);

        r1.show();
        r1.display();
        r1.cal_result();
    }
}
