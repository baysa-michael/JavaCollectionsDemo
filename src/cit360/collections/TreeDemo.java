package cit360.collections;

import java.util.TreeMap;

public class TreeDemo {
    public void TreeDemo() { }

    public static void runTreeDemo() {
        // Initialize a new TreeSet
        TreeMap<String, Integer> demoTree = new TreeMap<String, Integer>();

        // Add Elements to TreeMap
        demoTree.put("Johnson", 65);
        demoTree.put("Kealoha", 22);
        demoTree.put("Anderson", 37);
        demoTree.put("Sashimoto", 29);
        demoTree.put("Waver", 42);
        demoTree.put("Haliburton", 52);

        // Iterating and Displaying the Contents of the Tree
        System.out.println("------------TREE DEMONSTRATION-------------------");
        System.out.println("Welcome!  This function goes through a demonstration of trees using a TreeMap as an example.\n");
        System.out.println("Unlike a HashMap, using a TreeMap guarantees the order of items in a set of key-value pairs.\n");
        System.out.println("Trees are optimized by storing initial entries in order, making inserts slow but retrieval fast.\n");
        System.out.println("Tree Contents:");
        demoTree.forEach((x, y) -> System.out.println(x + " - " + y));

        // Test to see if the tree is empty and how many entries are in the map
        System.out.println("Is the tree currently empty?:  " + demoTree.isEmpty());
        System.out.println("How many entries are in the map?:  " + demoTree.size());


        // Differences
        System.out.println("\nMuch of the functionality of a TreeMap is similar to a LinkedHashMap\n" +
                "as identified in the prior demonstration, so this will focus on the specific differences of trees");

        // Inserting new items into trees
        System.out.println("\nWhen inserting new items into trees, the tree will automatically resort itself to rebalance the tree");
        demoTree.put("Jeremy", 59);
        demoTree.put("Indria", 44);
        System.out.println("Tree Contents:");
        demoTree.forEach((x, y) -> System.out.println(x + " - " + y));


        // Removing items from trees
        System.out.println("\nSimilarly, a tree is rebalanced when items are removed");
        demoTree.remove("Sashimoto");
        System.out.println("Tree Contents:");
        demoTree.forEach((x, y) -> System.out.println(x + " - " + y));

        System.out.println("\nThe process of insertion and removal is slower in Trees than in lists due to the rebalancing " +
                "process, but retrieval is faster due to the rebalancing");

        // Clear the Tree contents
        System.out.println("\nClear the tree with clear()");
        demoTree.clear();
        System.out.println("Map Contents:");
        demoTree.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("Is the tree currently empty?:  " + demoTree.isEmpty());
        System.out.println("How many entries are in the tree?:  " + demoTree.size());

        System.out.println("------------END TREE DEMONSTRATION---------------");
    }
}
