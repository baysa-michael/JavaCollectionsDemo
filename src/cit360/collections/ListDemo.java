package cit360.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public void ListDemo(){ }

    public static void runListDemo() {
        // Initializing a New List
        List<String> demoList = new ArrayList<String>();

        // Adding Elements to a List Collection
        demoList.add("Java");
        demoList.add("C++");
        demoList.add("PHP");
        demoList.add("SQL");
        demoList.add("R");
        demoList.add("VBA");
        demoList.add("Fortran");
        demoList.add("Javascript");
        demoList.add("HTML");
        demoList.add("Javascript");

        // Iterating and Displaying the Contents of the List
        System.out.println("------------LIST DEMONSTRATION-------------------");
        System.out.println("Welcome!  This function goes through a demonstration of lists using an ArrayList as an example.\n");
        System.out.println("List Contents:");
        demoList.forEach(n -> System.out.println(n));

        // Note that duplicates can exist in a list
        System.out.println("\nNote that there are two instances of 'Javascript' in the above list.");

        // Size of List
        System.out.println("\nYou can use .size() to determine the size of the list");
        System.out.println("The size of the list is:  " + demoList.size());

        // Contents At Index
        System.out.println("\nFind the content at a particular index using get()");
        System.out.println("The contents of the list at index 2 is:  " + demoList.get(2));

        // Index Of 'VBA'
        System.out.println("\nDetermine the index of an item using indexOf()");
        int removePosition = demoList.indexOf("VBA");
        System.out.println("\nVBA is located in index position: " + removePosition);

        // Removal of items by index
        System.out.println("\nItems can be removed by referencing the index position:");
        demoList.remove(removePosition);
        demoList.forEach(n -> System.out.println(n));
        System.out.println("Index 5 (VBA) was removed from the prior list");

        // Removal of items by object specification
        System.out.println("\nItems can also be removed by referencing the object to remove:");
        demoList.remove("Fortran");
        demoList.forEach(n -> System.out.println(n));
        System.out.println("Fortran was removed from the prior list");

        // Replacing items in the list by specific index
        System.out.println("\nItems can be replaced in the list by setting specific index:");
        demoList.set(demoList.lastIndexOf("Javascript"), "Perl");
        demoList.forEach(n -> System.out.println(n));
        System.out.println("The second instance of Javascript was replaced with Perl");

        // Sub-list Extraction and Adding All to a List
        System.out.println("\nSublists can be extracted, and you can add all elements from one list to another:");
        List<String> secondList = new ArrayList<String>();
        secondList.addAll(demoList.subList(0, 3));
        secondList.forEach(n -> System.out.println(n));
        System.out.println("The first 3 items on the original list were extracted and and added to a new list");

        // Clear the List
        System.out.println("\nYou can clear the contents of the list in order to prepare it for another use");
        demoList.clear();
        System.out.println("List Contents:");
        demoList.forEach(n -> System.out.println(n));
        System.out.println("The size of the list is:  " + demoList.size());

        System.out.println("--------END LIST DEMONSTRATION-------------------");
    }
}
