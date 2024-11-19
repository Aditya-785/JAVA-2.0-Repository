import javax.xml.transform.Source;

public class java_identifiers {
    public static void main(String[] args) {
        /*In Java, identifiers are used for identification purposes.
         Java Identifiers can be a class name, method name, variable name, or label. */

        /*Example of Java Identifiers .
            public class Test
                    {
             public static void main(String[] args)
             {
             int a = 20;
              }
                }
         Example of Valid Identifiers -

         MyVariable
        MYVARIABLE
        myvariale
        x
        i
        x1
        i1
        _myvariable
       $myvariable
        sum_of_array
        geeks123

        Example of unvalid indentifiers -

        My Variable  // contains a space
        123geeks   // Begins with a digit
        a+c // plus sign is not an alphanumeric character
        variable-2 // hyphen is not an alphanumeric character
        sum_&_difference // ampersand is not an alphanumeric character
         */

        String name = ("Aditya Sharma");
        int age = (18);
        String place = ("Gwalior");

        System.out.println("My name is"+name );
        System.out.println("I am "+age );
        System.out.println(" I live in Gwalior");



    }
}
