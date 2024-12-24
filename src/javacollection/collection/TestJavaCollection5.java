package javacollection.collection;

import java.util.*;
public class TestJavaCollection5{
    public static void main(String args[]){

        PriorityQueue<String> queue=new PriorityQueue<String>();
        //This line creates a new PriorityQueue of type String.
        // A PriorityQueue orders elements according to their natural ordering
        // (alphabetical in this case for String) or by a comparator if provided.

        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        // element() returns the head of the queue without removing it. If the queue is empty, it throws NoSuchElementException.
        //peek() also retrieves the head without removing it but returns null if the queue is empty.

        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        // remove() removes and returns the head of the queue. Throws NoSuchElementException if the queue is empty.
        //poll() removes and returns the head of the queue or null if the queue is empty.

        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
