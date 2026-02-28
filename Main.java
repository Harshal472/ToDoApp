class Student {
int rno;
String name;
Student(int r, String n) {
rno = r;
name = n;}
void show() {
System.out.println("Roll No : " + rno);
System.out.println("Name    : " + name);
}}
class Test extends Student {
int sub1, sub2;
Test(int r, String n, int s1, int s2) {
super(r, n);  
sub1 = s1;
sub2 = s2;
}
void display() {
System.out.println("Subject 1 Marks : " + sub1);
System.out.println("Subject 2 Marks : " + sub2);
}}
class Result extends Test {
int total;
double percentage;
Result(int r, String n, int s1, int s2) {
super(r, n, s1, s2); 
}
void cal_result() {
total = sub1 + sub2;
percentage = (total / 200.0) * 100;
System.out.println("Total Marks : " + total);
System.out.println("Percentage  : " + percentage + "%");
}}
public class Main {
public static void main(String[] args) {
Result r1 = new Result(75, "Harshal", 80, 78);
r1.show();
r1.display();
r1.cal_result();
}}
