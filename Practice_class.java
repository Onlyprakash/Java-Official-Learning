// OOPs:-
// Practice Questions for class And Objects

import java.sql.SQLOutput;

class Employee1{        // class Employee1 Question 1:-
    int salary;
    String name;        // Attributes

    public int getSalary() {    // properties 1
        return salary;
    }
    public String getName() {   // properties 2
        return name;
    }
    public void setName(String n){       //Method
        name = n;
    }

}

class cellPhone{        // class cellPhone Question 2:-
    public void ring(){
        System.out.println("Ringing....");  // method But they cannot give return Why because[Void]
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling Raj....");
    }
}

class Square{           // class Square Question 3:-
    int side;
    public int area(){      // Methods
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// Encapsulation:-
// Getter & Setter
class Student{          // class student [Getter & Setter]:- Example 1
    String name;
    int rollNumber;
    int age;

    public String getName() {       // Getter [Method]
        return name;
    }

    public void setName(String name) {     // Setter [Method] in Void
        this.name = name;
    }

    public int getRollNumber() {            // Getter [Method]
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {  // Setter [Method] in Void
        this.rollNumber = rollNumber;
    }

    public int getAge() {                       // Getter [Method]
        return age;
    }

    public void setAge(int age) {               // Setter [Method] in Void
        this.age = age;
    }
}

class BankAccount{          // class BankAccount [Getter & Setter]
    private long accountNumber;
    private  double balance;                    // Private [only Access for class]
                                //<-------------Both are Access modifyer [Methods]
    public void deposit(double amount){         // public void
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount){            // Method [Void]
        if(amount > 0 && amount <= balance){        // if and Else condition
            balance -= amount;
            System.out.println("Withdraw " + amount);
        }else{
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }
    public long getAccountNumber() {        // Getter [Method]
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {      // Setter [Method] in Void
        this.accountNumber = accountNumber;
    }
    public double getBalance() {             // Getter [Method]
        return balance;
    }
}
// OOPs:-
// inheritance:
class Animal{                   // Super-Class [inheritance] Example: 1
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){                                  // Constructor [Method]
        System.out.println("This Animal Eats Foods");
    }
}
class Dog extends Animal{
    String name;
    int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello(){                     // Constructor [Method]
        System.out.println("Woof");
    }
}
// OOPs:-
// Constructor in Inheritance   Example: 2
class Grandparent{
    Grandparent(){
        System.out.println(" GrandParent Era.....");
    }
    Grandparent(int x){                   // Constructor [Method]
        System.out.println(" i am an Overload Constructor with value of X as: " + x);
    }
}
class Parent extends Grandparent{
    Parent(){
        System.out.println(" Parent Era....");
    }
    Parent(int x, int y){                           // Constructor [Method]
        super(x);                   //-----------------> Super [Keyword] to Call the immediate parent Class Object
        System.out.println(" i am an Overloaded Constructor of Parent value of Y as: " + y);
    }
}
class Child extends Parent{
    Child(){
        System.out.println(" Child Era..");
    }
    Child(int x, int y, int z){                     // Constructor [Method]
        super(x,y);           //--------------------> Super [Keyword] to Call [Sub-Class] immediate parent Class Object
        System.out.println(" i am an Overloaded Constructor of Parent value of Z as: " + z);
    }
}
// OOPs:-
// Abstract method:   Example: 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing...........");
    }
    public void refill(){
        System.out.println("Refilling the Pen...........");
    }
    public void ChangeNib(){
        System.out.println("Changing the Nib..................");
    }
}
public class Practice_class {
    public static void main(String[] args) {
        // Question 1:
        Employee1 Prakash = new Employee1();
        Prakash.setName("prakash singh");
        Prakash.salary = 50000;

        System.out.println(Prakash.getSalary());
        System.out.println(Prakash.getName());

        // Question 2:
        cellPhone samsung = new cellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();

        // Question 3:
        Square sq = new Square();
        sq.side = 4;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Getter setter: [Example 1]
        Student student = new Student();
        student.name = "Vikram Batra";
        student.rollNumber = 61;
        student.setAge(25);

        System.out.println(student.getAge());
        System.out.println(student.getRollNumber());
        System.out.println(student.getName());

        // Getter Setter: [Example 2]
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(25252);
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);

        System.out.println(bankAccount.getBalance());

        // inheritance: [Example 1] Object of Class-[Animal]
        Animal a = new Animal();
        a.setName("Polar Bear");
        System.out.println(a.getName());

        // inheritance: [Example 1] Object of Class-[Dog]
        Dog d = new Dog();
        d.setName("Bob");
        d.sayHello();
        System.out.println(d.getName());

        // Constructor in Inheritance: [Example 2] Object of Class-[GrandParent]
        Grandparent G = new Grandparent();

       // Constructor in Inheritance: Object of Class-[Parent]
        Parent P = new Parent();

      // Constructor in Inheritance: Object of Class-[Child]
      //  Child cd = new Child();
      //  Child cd = new Child(10,20,30);

        // Abstract Method: [Example 1] Object of Class-[Pen]
        FountainPen pen = new FountainPen();
        pen.ChangeNib();
        pen.write();
        pen.refill();
    }
}


