package linkedlist.SingleLink;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoLinkList {

    public static void main(String[] args) {
    LinkedList <Integer> l1 = new LinkedList<>();
    l1.add(5);
    l1.add(1);
    l1.add(3);
        Collections.sort(l1);
    LinkedList<Integer> l2 = new LinkedList<>();
    l2.add(0);
    l2.add(4);
    l2.add(2);
    l2.add(10);
    l2.add(10);
    Collections.sort(l2);
    System.out.println(getMergeList(l1,l2));

    }

    public static LinkedList getMergeList(LinkedList l1, LinkedList l2){
        LinkedList  l3 = l1;
        if (l1 != null && l2 != null) {
            for (int i =0; i<l2.size();i++) {
                        l3.add(l2.get(i));
                }
            }
        Collections.sort(l3);
        return l3;
    }
    }
