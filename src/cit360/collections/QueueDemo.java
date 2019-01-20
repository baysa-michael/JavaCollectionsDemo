package cit360.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public void QueueDemo() { }

    public static void runQueueDemo() {
        // Initialize the Queue
        Queue<String> demoQueue = new ArrayBlockingQueue<String>(10,true);

        // Add elements to the queue
        demoQueue.add("John");
        demoQueue.add("Sally");
        demoQueue.add("Justin");
        demoQueue.add("Michael");
        demoQueue.add("Reuben");

        System.out.println("------------QUEUE DEMONSTRATION-------------------");
        System.out.println("Welcome!  This function goes through a demonstration of queues using an ArrayBlockingQueue as an example.\n");
        System.out.println("Queues are generally used in FIFO operations where the items input first come out first, although this is not always the case.");
        System.out.println("A similar implementation is Stack, which generally are used (but not necessarily) with LIFO operations.\n");
        System.out.println("Deques support double-ended operations\n");
        System.out.println("Queue Contents:");
        demoQueue.forEach(n -> System.out.println(n));
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());

        System.out.println("\nKey functions that exist and distinguish Queues include:  peek(), element(), remove(), and poll()");

        // Peeking at the Queue
        System.out.println("\nThe peek() function of the Queue implementation allows a user to access the first element in the queue without removing it from the queue");
        System.out.println("If empty, peek() will return NULL");
        System.out.println("Who is the first person in the list?:  " + demoQueue.peek());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());

        // Element
        System.out.println("\nThe element() function of the Queue implementation allows a user to access the first element in the queue without removing it from the queue");
        System.out.println("If empty, element() will throw a NoSuchElementException");
        System.out.println("Who is the first person in the list?:  " + demoQueue.element());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());

        // Remove
        System.out.println("\nThe remove() function of the Queue implementation allows a user to access the first element in the queue and removes it from the queue");
        System.out.println("If empty, remove() will throw a NoSuchElementException");
        System.out.println("Who is the first person in the list?:  " + demoQueue.remove());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());
        System.out.println("Who is the first person in the list?:  " + demoQueue.remove());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());

        // Poll
        System.out.println("\nThe poll() function of the Queue implementation allows a user to access the first element in the queue and removes it from the queue");
        System.out.println("If empty, poll() will return NULL");
        System.out.println("Who is the first person in the list?:  " + demoQueue.poll());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());
        System.out.println("Who is the first person in the list?:  " + demoQueue.poll());
        System.out.println("How many entries are in the queue?:  " + demoQueue.size());

        System.out.println("------------END QUEUE DEMONSTRATION---------------");
    }
}
