import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        // Primitive Data Types:-
        //[1] Integral Numbers
        //[2] Decimal Numbers
        //[3] Characters
        //[4] Booleans

        // [1] Integral numbers:
        // byte
        // short
        // int
        // long

        int age = 20;     // range of int [2147483647]
        byte age1 = 20;   // range of byte [127]
        short age3 = 20;  // range of short [32767]
        long age4 = 20;   // range of long [2147483647]
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        // Example:
        short age5 = 32767;  // range of short in positive value [32767] And this is negative value [327678]
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        //[2] Decimal numbers:
        // float range
        // double range

        // float range
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("Float Minimum Values: " + floatMin);
        System.out.println("Float Maximum Values: " + floatMax);

        // double range
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Double Minimum Value: " + doubleMin);
        System.out.println("Double Maximum Value: " + doubleMax);
        // Example:1
        float mySalary = 1000.111112222223333344f;
        double yourSalary = 1000.1111222223333344444455555566676777d;
        System.out.println(mySalary);
        System.out.println(yourSalary);
        // Example:2
        // mySalary = 1055555555555555555555555555555555555555500.1111111112222222133321f;
        //  yourSalary = 10555555555555555555555555555555500.111112111222211211112;
        // System.out.println(mySalary);
        //System.out.println(yourSalary);

        //[3] Characters:
        // char

        // Example:1 Convert to Character Into Integer
        char initial = 'A';
        System.out.println((int) initial);

        // Example:2
        // char initial = 'B';
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        // Example:3 Convert to integer & Unicode into Symbol
        char heartSymbol = (char) 10084;
        System.out.println(heartSymbol);

        char rightSymbol = '\u27A4'; // Unicode
        System.out.println(rightSymbol);

        char hindiChar = 2325;
        System.out.println(hindiChar);

        //[4] Booleans:  this is a resevered keyword [true or false]
        // boolean

        boolean isEligible = true;
        System.out.println(isEligible);

        // Widening [Automation] Conversion And Narrowing Conversion:-
        // Datatype of Size in Bytes:
        //int
        //long
        //float
        // double

        int a = 10; // 4 bytes
        long b = a; // 8 bytes
        float c = a; // 4 bytes
        double d = a; // 8 bytes
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Widening Conversion [Automating conversion]:

        byte byteValue = 10; // 1 byte = 8 bits
        short shortValue = byteValue; // 2 bytes
        int intValue = shortValue; // 4 bytes
        long longValue = intValue; // 8 bytes
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        // Example:1
        char charValue = 'A';
        int intValueChar = charValue; // Widening conversion from char to int

        System.out.println("char: " + charValue);
        System.out.println("int: " + intValueChar);
        // Example:2
        char floatcharValue = 'A';
        float floatValueChar = charValue; // Widening conversion from char to float

        System.out.println("char: " + floatcharValue);
        System.out.println("float: " + floatValueChar);

        // Narrowing Conversion [Writing Conversion]:
        //    double doubleValue = 123.456;
        //     float floatValue = (float) doubleValue; // Narrowing conversion from double to float
        //    long longValue = (long) floatValue; // Narrowing conversion from float to long
        //    int intValue = (int) longValue; // Narrowing conversion from long to int


        // Variables:-
        // variables are Case Sensitive
        // Can be Used Letters, Digits, Dollar signs, Or Underscores
        // Must Begin with a Letter, Dollar sign ($), Or Underscore (_)
        // Cannot Use Java Keywords as variable names

        //Examples:
        int amount = 1000;
        System.out.println(amount);

        String FullName = "Prakas Singh";
        System.out.println(FullName);

        // Arithmetic Operators:-
        // [1]Addition
        // [2]Substraction [deduction]
        // [3]Multiplication
        // [4]Division [quotient]
        // [5]Modulas


        // Examples:-

        int MySalary = 1000;
        //    int bonus = 500;
        int deduction = 500;
        //    int total = MySalary + bonus;     //Addition
        //    int total = MySalary - deduction;
        int monthlyTotal = MySalary - deduction;    //Substraction
        int yearlyTotal = monthlyTotal * 12;       //Multiplication
        System.out.println(yearlyTotal);
        //    System.out.println(total);
        int perChild = yearlyTotal / 3;     //Divided
        System.out.println(perChild);

        int a1 = 5;   //Modulas
        int b2 = 2;
        int c3 = a1 % b2;
        System.out.println(c3);

        int b1 = 5;
        double c1 = b1 + 10.1;
        System.out.println(c1);

        float A1 = 12.2f;
        long B2 = 23723;
        float v = A1 + B2;  // float v is signify scienctific notation
        System.out.println(v);

        long C1 = 438347634;
        long i = C1 * 24223;
        System.out.println(i);

        int D1 = 10;
        int D2 = 3;
        int quotient = D1 / D2;
        System.out.println(quotient);

        double D3 = 10;
        int D4 = 3;
        double iquotient = D3 / D4;
        System.out.println(iquotient);

        float d3 = 10.0f;
        int d4 = 3;
        float iiquotient = d3 / d4;
        System.out.println(iiquotient);

        // Compound Assignment Operators:-

        int E1 = 10, E2 = 5;
        int result = E1 / E2 + 3;
        System.out.println(result);

        int e1 = 10, e2 = 5;
        int iresult = e1 / e2 + 3 * 2 - 1;
        System.out.println(iresult);

        int F1 = 10;
        F1 += 1;
        System.out.println(F1);

        int f1 = 10;
        f1 -= 1;
        System.out.println(f1);

        int F2 = 10;
        F2 *= 2;
        System.out.println(F2);

        int f2 = 10;
        f2 /= 2;
        System.out.println(f2);

        int F3 = 10;
        F3 %= 2;
        System.out.println(F3);

        // Increment And Decrement Operators:-

        int f4 = 1;
        f4++;
        System.out.println(f4);

        int F4 = 1;
        int F5 = F4++ + F4;    //Post-increment [a++] left to right
        System.out.println(F5);// First used then increment in second value

        int f5 = 1;
        int f6 = ++f5 + f5;    //Pre-increment [++a] right to left
        System.out.println(f6);

        int f7 = 1;
        int f8 = f7 + ++f7;
        //  int f8 = f7 + (++f7);  first doing increment then used in second
        System.out.println(f8);

        int f9 = 1;
        System.out.println(f9++ + --f9);

        double x = 1.5, y = 2.5, z = 3.5;
        double complexCalculation = (x + y) * (z - y) / (x + z);
        System.out.println(complexCalculation);

        // Bitwise Operators:-
        //[1] and operator &
        //[2] or operator |
        //[3] xor ^
        //[4] not ~
        //[5] left shift <<
        //[6] right shift >>
        //[7] unsigned right shift >>>

        int B = 5;      // Binary
        System.out.println(Integer.toBinaryString(B));

        int G = 5 & 4;     // and operator &

        System.out.println("Binary of 5: " + Integer.toBinaryString(5));
        System.out.println("Binary of 4: " + Integer.toBinaryString(4));
        System.out.println(G);

        int G1 = 5 | 7;    // or operator |
        System.out.println("Binary of 5: " + Integer.toBinaryString(5));
        System.out.println("Binary of 7: " + Integer.toBinaryString(7));

        int G2 = 5 ^ 7;    // xor operator ^
        System.out.println("Binary of 5: " + Integer.toBinaryString(5));
        System.out.println("Binary of 7: " + Integer.toBinaryString(7));
        System.out.println(G2);

        int g = 5;
        System.out.println(Integer.toBinaryString(g));
        int h = ~g;     // not operator ~
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));

        int j = 5;
        System.out.println(Integer.toBinaryString(j));
        int H = j << 1;     // left shift operator <<
        System.out.println(H);
        System.out.println(Integer.toBinaryString(H));

        int J = 5;
        System.out.println(Integer.toBinaryString(J));
        int K = J >> 1;     // Right shift operator >>
        System.out.println(K);
        System.out.println(Integer.toBinaryString(K));

        int M = -5;
        System.out.println(Integer.toBinaryString(M));
        int N = M >> 2;
        System.out.println(Integer.toBinaryString(N));
        System.out.println(N);

        int m = -5;
        System.out.println(Integer.toBinaryString(m));
        int n = m >>> 2;    //Unsigned right shift operator >>>
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n);

        // Println Vs Print Vs Printf:-
        // Examples:
        int w = 1;
        int X = 2;
        String Y = "Sum";
        System.out.println(w + X + Y);
        System.out.println(Y + " of " + w + " & " + X + " : " + (w + X));
        System.out.print(Y + " of " + w + " & " + X + " : " + (w + X));
        //  Println and Print are both create a new line
        System.out.printf(Y + " of " + w + " & " + X + " : " + (w + X) + "\n");
        // Printf are not create a new line

        // Strings:-
        // Examples:
        String name = "Major"; // Sequence of Characters
        System.out.println(name);

        String student = "prakash";
        String address = "India";
        System.out.println(student);
        System.out.println(address);

        String P = new String("Ram");  // false
        String P1 = new String("Ram");
        String P2 = "Ram";  // true
        String P3 = "Ram";
        System.out.println(P == P1); // P, P1 both are different new allocation[P],[P1] in different memory
        System.out.println(P2 == P3); // P2, P3 both are same memory with different allocation[P2],[P3]

        // String Methods:-

        String Name = "Raj";
        int length = Name.length(); // length method
        System.out.println(length);

        String NAme = "Akash Sharma";
        char t = NAme.charAt(2); // charAt method
        System.out.println(t);

        String Name1 = "akash Sharma";
        System.out.println(NAme.equals(Name1)); // Equals method

        String Name2 = "AKAsh ShArmA";
        System.out.println(Name1.equalsIgnoreCase(Name2));// Equals Ignore-Case of [capital or small] letters

        String str1 = "remote";
        String str2 = "car";
        System.out.println('r' + 0); // 114 ASCII Value of 'r'
        System.out.println('c' + 0); // 99 ASCII Value of 'c'
        int o = str1.compareTo(str2); // CompareTo method
        System.out.println(o);

        String M1 = "refer";
        String M2 = "REFER";
        System.out.println(M1.compareToIgnoreCase(M2)); // compareTo Ignore-Case method

        String name1 = "Mankrit Singh";
        String substring = name1.substring(0, 3);
        System.out.println(substring); // Substring method

        String name2 = "abcdefg";
        System.out.println(name2.toUpperCase()); // toUpperCase method

        String name3 = "ABCDEFG";
        System.out.println(name3.toLowerCase()); // toLowerCase method

        String name4 = "      Indian Amry       ";
        System.out.println(name4.trim()); // trim method [Ignore Extra space]

        String name5 = "Sam Bahadur";
        String name6 = name5.replace("Bahadur", "Manekshaw");
        System.out.println(name6); // replace method

        String name7 = "Captain Vikram Batra";
        System.out.println(name7.contains("Cap"));
        System.out.println(name7.contains("ram"));
        System.out.println(name7.contains("nma"));
        System.out.println(name7.contains("f")); // Contains method

        String name8 = "Major Sudhir Walia";
        System.out.println(name8.startsWith("Ma")); // startsWith method
        System.out.println(name8.endsWith("lia")); // endsWith method

        int u = name8.lastIndexOf("l");  //----
        System.out.println(u); // lastIndexOf method

        String formattedstr = String.format("My name is %s and I am %d years old.", "John", 20);
        System.out.println(formattedstr); // format method

        // Conditional Statements:-
        //[1] relational operators
        //[2] logical operators

        // Relational operators compare two values and return a boolean result

        int AB = 1;
        int BA = 2;
        boolean CA = AB < BA;
        System.out.println(CA);

        int ab = 1;
        int ba = 2;
        boolean ca = ab == ba;
        System.out.println(ca);

        int DA = 1;
        int AD = 2;
        boolean DB = DA >= AD;
        System.out.println(DB);

        int da = 1;
        int ad = 2;
        boolean db = da <= ad;
        System.out.println(db);

        String strr1 = "hello";
        String strr2 = "hello";
        System.out.println(strr1 == strr2);

        // Logical operators:
        // && logical AND
        // || logical OR
        // ! logical NOT

        // Examples:
        boolean XY = true;
        boolean YX = false;
        System.out.println(XY && YX);// && logical AND

        // Exam = 100 > 33
        // Age is > 18

        int tonyMarks = 35;
        int tonyAge = 55;
        System.out.println(tonyMarks >= 33 && tonyAge <= 18); // && logical AND [true&&true]

        boolean xy = true;
        boolean yx = false;
        System.out.println(xy || yx);// ||logical OR

        boolean Xy = 2 < 1;
        boolean Yx = 1 <= 3;
        System.out.println(Xy || Yx);

        String NAAM = "Krish";
        int exp = 2;
        boolean tier1 = true;
        boolean cond1 = exp >= 5;
        System.out.println(tier1 || cond1); // || logical OR [only want one condition true]

        int cb = 100;
        int dc = 1;
        boolean ac = cb > dc;
        System.out.println(!ac);// ! logical NOT

        // Conditional Statements:
        int AGEe = 20;

        if (AGEe >= 18) {
            System.out.println("you are an Adult !"); // if condition
        } else {
            System.out.println("you are a child !"); // else condition
        }
        ;

        int AGe = 50;// Age 20
        int marks = 35;// 33/100

        if (AGe <= 20 && marks >= 33) {  //----&& logical AND
            System.out.println("Congrats !");
        } else {
            System.out.println("Better luck next time !");
        }
        ;

        int MARKs = 99; // if, else if and else [Ladder] statements
        // marks >= 90 A
        // marks >= 75 B
        // marks >= 60 C
        // marks >= 0 D
        if (MARKs >= 90) {
            System.out.println("Grade A"); // if condition
        } else if (MARKs >= 75) {
            System.out.println("Grade B"); // else if condition
        } else if (MARKs >= 60) {
            System.out.println("Grade C"); // else if condition
        } else {
            System.out.println("Grade D"); // else condition
        }
        ;

        int day = 3;

        if (day == 1) {
            System.out.println("Mondaay");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invaild day");
        }
        ;

        // Switch Case:
        int days = 4;
        switch (days) {
            case 1: {
                System.out.println("Monday");
            }
            case 2: {
                System.out.println("Tuesday");
            }
            case 3: {
                System.out.println("Wednesday");
            }
            case 4: {
                System.out.println("Thursday");
            }
            case 5: {
                System.out.println("Friday");
            }
            case 6: {
                System.out.println("Saturday");
            }
            case 7: {
                System.out.println("Sunday");
            }
            default: {
                System.out.println("Invaild day");
            }
        };

        // Breaks Statements:
        int Months = (1);
        switch (Months){
            case 1:{
                System.out.println("January");
            }
            case 2:{
                System.out.println("February");
            }
            case 3:{
                System.out.println("March");
            }
            case 4:{
                System.out.println("April");
            }
            case 5:{
                System.out.println("May");
            }
            case 6:{
                System.out.println("June");
            }
            case 7:{
                System.out.println("July");
            }
            case 8:{
                System.out.println("August");
            }
            case 9:{
                System.out.println("September");
                break;
            }
            case 10:{
                System.out.println("October");
            }
            case 11:{
                System.out.println("November");
            }
            case 12:{
                System.out.println("December");
            }
            default:{
                System.out.println("Invaild Months");
            }
        };

        String fruit = "Kiwi"; // rename fruits by your according
        switch (fruit){
            case "Apple":
                System.out.println("It's a apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            case "Cherry":
                System.out.println("It's a Cherry");
                break;
            case "Kiwi":
                System.out.println("It's a Kiwi");
                break;
            default:
                System.out.println("Unknown fruit");
        };

        int number = 4;
        switch (number){
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1, 2, or 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Number is not 1, 2, 3, 4, or 5");
                break;

        };

        // Loops:-
        // While loop
        // for loop
        // Do-While loop
        // Nested loop

    // While loop:

        int l = 0;
        while (l < 10){
            System.out.println("Hello World!");
            l = l + 1;  // this statement write for stop the loop
        };

        int Q = 1;
        while (Q <= 50){
            System.out.println(Q);
            Q++;  // this statement write for stop the loop
        };

    // Do-While loop:

        int W = 1;
        do{
            System.out.println(W);
            W++;
        } while (W <= 50);


    // For loop:

       // for (initialisation; condition; update){
        //    system.out,println();
        // };


        for (int e = 1; e <= 10; e++){
            System.out.println(e);
        };

    // Examples:
        /*
        * 1
        * 10
        * 100
        * 1000
        * 10000
        * 100000
        * */

         for (int r = 1; r <= 100000; r = r * 10){
             System.out.println(r);
         };

     //    for (int r = 1, u2 = 1; u2 <= 6; r = r * 10, r++){ //-------?
     //        System.out.println(r);
     //    };

    // Print table of 5 or 9

        for (int i2 = 1; i2 <= 10; i2++){
            System.out.println(i2*5);
        } ;

        for (int i3 = 1; i3 <= 10; i3++){
            System.out.println(i3 * 9);
        };

        for (int i4 = 1; i4 <= 10; i4++){
            System.out.println(i4 +" x 5 =" +i4 * 5);
        };

    // Sum of First 10 Natural Numbers

        int sum = 0;                     // sum = sum + i5      // 10 numbers are added one by one
        int i5 = 1;                      // sum = 0 + 1 = 1
        while(i5 <= 10){                 // sum = 1 + 2 = 3
            sum = sum + i5;              // sum = 3 + 3 = 6
            i5++;                        // sum = 6 + 4 = 10
            System.out.println(sum);     // sum = 10+ 5 = 15
        };                               // sum = 15+ 6 = 21
                                         // --------+ 10= 55;------>output

    // Factorial of a Number
    // 6! = 6.5.4.3.2.1                  // 6 x 5 = 30
                                         // 30 x 4 = 120
        int n1 = 6;                      // 120 x 3 = 360
        int res = 1;                     // 360 x 2 = 720
        while(n1 > 0){                   // 720 x 1 = 720;-------->output
            res = res * n1;
            n1--;
        }
        System.out.println(res);

    // Nested loop:

    //    *
    //    **
    //    ***
    //    ****
    //    *****
    //    ******

        for (int i6 = 0; i6 < 6; i6++) {        // outer loop----->2nd same iteration follow then exist the loop
            for (int j5 = 0; j5 <= i6; j5++) {  // Inner loop----->1st iteration and "*"
                System.out.println("*");
            }
            System.out.println();
        };

    // Break And Continue loop

        int i7 = 0;
        while (i7 < 10){
            System.out.println(i7);
            if (i7 == 5){
                break;
            }
            i7++;
        };
        System.out.println("Hello !");

       int i8 = 1;
       while (i8 <= 10){
           if (i8 == 5){
               i8++;
               continue;
           }
           System.out.println(i8);
           i8++;
       };

    // Arrays:-
    // 1D, 2D array

        // type[] variableName;
        int[] arr = new int[10];    // Subscript operator----->[] is only used for Array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);

        int[] arrr = new int[10];       // Traversing An Array with loop
        for(int ar1 = 0; ar1 < 10; ar1++){
            System.out.println(arr[ar1]);
        };

    //  1D Array:-
        // 1 Dimensional Array:

//      Heap Memory:
//          +---+---+---+---+---+
//          | 0 | 0 | 0 | 0 | 0 | <- Array Object (of 5 integers) in Heap memory
//          +---+---+---+---+---+
//          ^
//          |
//          Stack Memory:
//          ar

        int ar[] = new int[5];    // int[5] are integer fixed in your according
        ar[0]=10;
        ar[1]=20;
        ar[2]=30;
        ar[3]=40;
        ar[4]=50;
        for(int ar2 = 0; ar2 < 4; ar2++){
    //  for(int i = 0; i < ar.length; i++){-------->// length of ar[] is 4
            System.out.println(ar[ar2]);

        };

    // Search And Elements in An Array

        int ary[] = {1, 4, 2, 55, 7, -2};
        for(int ar3: ary){
            if(ar3 == 55){
                System.out.println("Found");
            }
        };

    // Find Max Elements

        int ary1[] = new int[5];
        ary1[0] = 2;
        ary1[1] = 12;
        ary1[2] = 4552;
        ary1[3] = -32;
        ary1[4] = 22;
        int reesult = 0;

        for (int ar4 = 0; ar4 < ary1.length; ar4++){
            if(ary1[ar4] > reesult){
                reesult = ary1[ar4];
            }
        }
        System.out.println(reesult);

    // Reverse Print Array

        int[] arry = {1,2,3,4,5,6,7,8,9,10,20,30,40,50};
        for (int ar5 = arry.length - 1; ar5 >= 0; ar5--){
            System.out.println(arry[ar5]);
        };

    // Sum of Array

        int[] aary = {-2, 4, 55, -4, 11, -55, 11, 2};
        int suum = 0;

        for (int k = 0; k < aary.length; k++) {
            suum += aary[k];
        }
        System.out.println(suum); //-----> 22 Output of sum

    //  2D Array:-
        //  2 Dimensional Array:

//          arrys:
//         +---+---+---+
//         | 0 | 0 | 0 |   arrys[0]
//         +---+---+---+
//         | 0 | 0 | 0 |   arrys[0]
//         +---+---+---+
//         | 0 | 0 | 0 |   arrys[0]
//         +---+---+---+


        int[][] arrys = new int[3][3]; //-----> 3 Rows and 3 Columns
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[1][2]); //----> 6 Output is [1][2]


        int[][] aryys = new int[3][3];
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int ar5 = 0; ar5 < nums.length; ar5++) {
            for (int ra1 = 0; ra1 < nums.length; ra1++) {
                System.out.println(nums[ar5][ra1] + " ");
            }
            System.out.println(); //-----> Output is like be: 1 2 3
                               //                             4 5 6
                              //                              7 8 9
        };

        char arryy[][] = new char[3][2];
        arryy[0][0] = 'a';
        arryy[0][1] = 'b';
        arryy[1][0] = 'c';
        arryy[1][1] = 'd';
        arryy[2][0] = 'e';
        arryy[2][1] = 'f';
        for (int k = 0; k < arryy.length; k++) {
            for (int p = 0; p < arryy[k].length; p++) {
                System.out.println(arryy[k][p] + " ");
            }
            System.out.println(); //----> Output is like be: a b
                                //                           c d
        };                      //                           e f




    }
}








