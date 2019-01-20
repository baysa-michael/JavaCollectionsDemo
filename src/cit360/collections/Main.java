package cit360.collections;

public class Main {

    public static void main(String[] args) {

        // List Demo
        ListDemo myListDemo = new ListDemo();
        myListDemo.runListDemo();


        // Set Demo
        SetDemo mySetDemo = new SetDemo();
        mySetDemo.runSetDemo();

        // Map Demo
        MapDemo myMapDemo = new MapDemo();
        myMapDemo.runMapDemo();

        // Tree Demo
        new TreeDemo().runTreeDemo();

        // Queue Demo
        new QueueDemo().runQueueDemo();

    }
}
