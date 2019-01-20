package cit360.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public void MapDemo() { }

    public static void runMapDemo() {
        // Initializing a new linked hash map
        Map demoMap = new LinkedHashMap();

        // Adding elements to a link hash map
        demoMap.put("CIT160", "A-");
        demoMap.put("CIT225", "B");
        demoMap.put("CIT260", "A");
        demoMap.put("CIT325", "A-");
        demoMap.put("CIT360", "A+");
        demoMap.put("CIT160", "B+");




        // Iterating and Displaying the Contents of the Map
        System.out.println("------------MAP DEMONSTRATION-------------------");
        System.out.println("Welcome!  This function goes through a demonstration of maps using a LinkedHashMap as an example.\n");
        System.out.println("Unlike a HashMap, using a LinkedHashMap guarantees the order of items in a set of key-value pairs.\n");
        System.out.println("Map Contents:");
        demoMap.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("\nNote that Maps cannot contain duplicate keys");
        System.out.println("In the adding sequence prior to this, an attempt was made to insert a duplicate key entry");
        System.out.println("(CIT160).  This entry overrode the previous CIT160 entry");

        // Test to see if the map is empty and how many entries are in the map
        System.out.println("Is the map currently empty?:  " + demoMap.isEmpty());
        System.out.println("How many entries are in the map?:  " + demoMap.size());

        // Testing for Keys or Values in Map
        System.out.println("\nYou can test the map to check and see if a key or a value is contained therein with the containsKey() and containsValue() functions");
        System.out.println("Does the map key contain the course CIT270?:  " + demoMap.containsKey("CIT270"));
        System.out.println("Does the map key contain the course CIT325?:  " + demoMap.containsKey("CIT325"));
        System.out.println("Do the map values contain a C?:  " + demoMap.containsValue("C"));
        System.out.println("Do the map values contain a A-?:  " + demoMap.containsValue("A-"));

        // Identify the value of a particular key
        System.out.println("\nYou can use the get() function to retrieve the value for a particular key");
        System.out.println("What grade did the student get in CIT 225?:  " + demoMap.get("CIT225"));

        // Extract all the keys as a set
        System.out.println("\nYou can extract all the keys as a Set with keySet()");
        Set thisKeySet = demoMap.keySet();
        System.out.println("List of Keys:");
        thisKeySet.forEach(n -> System.out.println(n));

        // Extract all the values as a collection
        System.out.println("\nYou can extract all the values as a Collection with values()");
        Collection myValues = demoMap.values();
        System.out.println("List of Values:");
        myValues.forEach(n -> System.out.println(n));

        // Remove items from the map
        System.out.println("\nRemove items from the map with remove()");
        System.out.println("\nRemove CIT225");
        demoMap.remove("CIT225");
        System.out.println("Map Contents:");
        demoMap.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("How many entries are in the map?:  " + demoMap.size());

        // Clear the map contents
        System.out.println("\nClear the map with clear()");
        demoMap.clear();
        System.out.println("Map Contents:");
        demoMap.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("Is the map currently empty?:  " + demoMap.isEmpty());
        System.out.println("How many entries are in the map?:  " + demoMap.size());


        System.out.println("");
        System.out.println("------------END MAP DEMONSTRATION---------------");
    }
}
