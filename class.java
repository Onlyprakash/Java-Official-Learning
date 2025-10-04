// JAVA INTRO:-
// Class And Objects:

class Employee{             // 1st Create a class object like Employee
    int id;                 // Attributes
    String name;
    int Salary;
    public void printDetails(){     // To create and Rename your object where you want to save any [Variable] name.
                // printDetails is your new Object
        System.out.println("My id is" + id);        // Methods [Function] & [Behaviour]
        System.out.println("and My name is" + name);
    }

    public int getSalary() {
        return Salary;
    }
}
class test_class {
    public static void main(String[] args) {
        System.out.println("this is our test class");
        Employee peter = new Employee(); // [First] Instantiating A New Employee Object

        Employee John = new Employee();


    // [Second] Settings Attributes (Properties of a peter)
        peter.id = 12;
        peter.name = "PeterParker";
        peter.Salary = 15000;

    //  Settings Attributes (Properties of John)
        John.id = 15;
        John.name = "johnWick";
        John.Salary = 16000;

    // Printing the Attributes
        System.out.println(peter.id);
        System.out.println(peter.name);
        System.out.println(John.Salary);
        System.out.println(peter.Salary);

        peter.printDetails();   // this is your object where you save class Attributes [properties] And methods [behaviour]
        John.printDetails();




    }

}
