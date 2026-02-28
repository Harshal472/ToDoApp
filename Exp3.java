class Account
{
    int acc_no;
    float bal;
    String name;

    Account(int a, float b, String n)
    {
        acc_no = a;
        bal = b;
        name = n;
    }

    void put()
    {
        System.out.println("Account no.:" + acc_no);
        System.out.println("Balance:" + bal);
        System.out.println("Name:" + name);
    }

    float deposit(float amt)
    {
        bal = bal + amt;
        return bal;
    }

    float withdraw(float amt)
    {
        bal = bal - amt;
        return bal;
    }
}

class Exp3
{
    public static void main(String arg[])
    {
        Account A = new Account(55, 6000, "Komal");
        A.put();

        float t = A.deposit(500.5f);
        System.out.println("Amount after deposit is:" + t);

        float a = A.withdraw(100.5f);
        System.out.println("Amount after withdraw is:" + a);
    }
}
