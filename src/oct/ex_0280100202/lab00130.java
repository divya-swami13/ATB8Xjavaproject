package oct.ex_0280100202;

import java.util.ArrayList;

public class lab00130 {
    public static void main(String[] args) {
        // collection framework
        // list - interface
        // Arraylist, linkedlist, stack and vector  class


        //collection of item with same or different data type is a list

        //list
        ArrayList studentlist = new ArrayList();
        studentlist.add("divya");
        studentlist.add("akash");
        studentlist.add("pramod");
        studentlist.add("pramod");// -- duplicate data also allowed
        studentlist.add("amit");
        studentlist.add(true);
        studentlist.add(123); // different data type is also allowed in list
        studentlist.add(null);// null is also allowed

        System.out.println(studentlist);

        // list is no fixed size no ,different data types add
    }
}
