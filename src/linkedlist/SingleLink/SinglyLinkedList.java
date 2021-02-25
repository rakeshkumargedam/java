package linkedlist.SingleLink;

import java.util.Collections;
import java.util.LinkedList;

public class SinglyLinkedList {

    public static void main (String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(3);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}
