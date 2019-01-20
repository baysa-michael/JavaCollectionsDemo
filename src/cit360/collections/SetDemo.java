package cit360.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public void SetDemo() { }

    public static void runSetDemo() {
        // Initializing a New Hash Set
        Set<String> demoSet = new HashSet<String>();
        demoSet.clear();

        // Adding Elements to a Set Collection
        demoSet.add("Java");
        demoSet.add("C++");
        demoSet.add("PHP");
        demoSet.add("SQL");
        demoSet.add("R");
        demoSet.add("VBA");
        demoSet.add("Fortran");
        demoSet.add("Javascript");
        demoSet.add("HTML");
        demoSet.add("Javascript");

        System.out.println("------------SET DEMONSTRATION-------------------");
        System.out.println("Welcome!  This function goes through a demonstration of sets using a HashSet as an example.\n");
        System.out.println("Note that using a HashSet does not guarantee the order of items in a set.\n");
        System.out.println("Set Contents:");
        demoSet.forEach(n -> System.out.println(n));
        System.out.println("\nNote that Sets cannot contain duplicate elements");
        System.out.println("In the adding sequence prior to this, an attempt was made to insert a duplicate Javascript");
        System.out.println("entry, but no entry was made as it would have been a duplicate");

        // Size of Set
        System.out.println("\nSimilar to Lists, you can determine the number of elements within using size()");
        System.out.println("The size of the current set is: " + demoSet.size());

        // Is Set Empty
        System.out.println("\nCheck to see if a set is empty with the isEmpty() function");
        System.out.println("Is this set empty?: " + demoSet.isEmpty());

        // Find an Item
        System.out.println("\nFind if an item in a set using the contains() function");
        System.out.println("Does the list contain BASIC?:  " + demoSet.contains("BASIC"));
        System.out.println("Does the list contain SQL?:  " + demoSet.contains("SQL"));

        // Remove Items
        System.out.println("\nRemove specific items from the set");
        System.out.println("Remove C++\n");
        demoSet.remove("C++");
        System.out.println("Set Contents:");
        demoSet.forEach(n -> System.out.println(n));

        // Key Functions
        System.out.println("\nSome key functions that work with Sets include: addAll(), retainAll(), and removeAll()");

        // addAll()
        System.out.println("The addAll() feature acts as the UNION command in SQL, bringing two sets together, retaining only unique values");
        Set<String> testSetA = new HashSet<String>();
        testSetA.add("BASIC");
        testSetA.add("C#");
        testSetA.add("VBA");
        System.out.println("\nInsert Set Contents:");
        testSetA.forEach(n -> System.out.println(n));
        demoSet.addAll(testSetA);
        System.out.println("\nSet Contents:");
        demoSet.forEach(n -> System.out.println(n));

        // retainAll()
        System.out.println("The retainAll() feature acts as the JOIN command in SQL, retaining only matching values between lists");
        Set<String> testSetB = new HashSet<String>();
        testSetB.add("HTML");
        testSetB.add("C#");
        testSetB.add("VBA");
        testSetB.add("Javascript");
        testSetB.add("R");
        testSetB.add("C");
        System.out.println("\nRetain Set Contents:");
        testSetB.forEach(n -> System.out.println(n));
        demoSet.retainAll(testSetB);
        System.out.println("\nSet Contents:");
        demoSet.forEach(n -> System.out.println(n));

        // removeAll()
        System.out.println("The removeAll() feature acts as the DELETE command in SQL, removing matching values between lists");
        Set<String> testSetC = new HashSet<String>();
        testSetC.add("R");
        testSetC.add("Javascript");
        System.out.println("\nRemove Set Contents:");
        testSetC.forEach(n -> System.out.println(n));
        demoSet.removeAll(testSetC);
        System.out.println("\nSet Contents:");
        demoSet.forEach(n -> System.out.println(n));

        // Clear the Set
        System.out.println("\nSimilar to lists, you can clear the entire set with the clear() function");
        demoSet.clear();
        System.out.println("Set Contents:");
        demoSet.forEach(n -> System.out.println(n));
        System.out.println("The size of the current set is: " + demoSet.size());
        System.out.println("Is this set empty?: " + demoSet.isEmpty());

        System.out.println("------------END SET DEMONSTRATION---------------");
    }
}
