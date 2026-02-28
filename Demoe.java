class A extends Thread
{
public void run()
{
for(int i = 1; i <= 10; i++)
{
System.out.println("Ascending = " + i);
}
System.out.println("End of Class A");
}
}
class B extends Thread
{
public void run()
{
for(int j = 10; j >= 1; j--)
{
System.out.println("Descending = " + j);
}
System.out.println("End of Class B");
}
}
public class Demo
{
public static void main(String args[])
{
A a1 = new A();
B b1 = new B();
a1.start(); 
b1.start();   
}
}