// Interface
interface Criteria {
    static final float BONUS = 3.5f;
    static final float AC = 0.5f;

    void put();
}

// Parent class
class Emp {
    int id;
    String name;
    float salary;

    Emp(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void putdata() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
}

// Child class
class EmpBonus extends Emp implements Criteria {
    float bonus;
    float allowance;

    EmpBonus(int i, String n, float s) {
        super(i, n, s);
    }

    void cal_allowance() {
        bonus = salary * BONUS / 100;
        allowance = salary * AC / 100;
    }

    public void put() {
        super.putdata();
        System.out.println("Bonus         : " + bonus);
        System.out.println("Allowance     : " + allowance);
    }
}

// Main class
public class Total {
    public static void main(String[] args) {
        EmpBonus e1 = new EmpBonus(75, "Harshal", 38000);

        e1.cal_allowance();
        e1.put();
    }
}
