public class operators {
    public static void main(String[] args) {
    /*
        Types of Operators in Java
        There are multiple types of operators in Java all are mentioned below:

        Arithmetic Operators
        Unary Operators
        Assignment Operator
        Relational Operators
        Logical Operators
        Ternary Operator
        Bitwise Operators
        Shift Operators
        instance of operator

        1. Arithmetic Operators
They are used to perform simple arithmetic operations on primitive and non-primitive data types.

* : Multiplication
/ : Division
% : Modulo
+ : Addition
– : Subtraction
     */


     // Examples of Arthmetic Operators -

        int a = 10;
        int  b = 5;

        int sum = a+b;//addition
        int diff =a-b;//subtraction
        int multiply = a*b;//multiplication
        int div = 0;//divison
        int mod = b%a;//modulus

        System.out.println("sum:"+sum);
        System.out.println("diff:"+diff);
        System.out.println("multiplication:"+multiply);
        System.out.println("divison:"+div);
        System.out.println("modulus:"+mod);

        /*

        ++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators.
        Post-Increment: Value is first used for computing the result and then incremented.
        Pre-Increment: Value is incremented first, and then the result is computed.

        – –  : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators.
        Post-decrement: Value is first used for computing the result and then decremented.
        Pre-Decrement: The value is decremented first, and then the result is computed.


         */

        // Examples are given as -

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));







    }
}
