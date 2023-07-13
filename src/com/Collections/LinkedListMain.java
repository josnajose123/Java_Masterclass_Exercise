package com.Collections;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.print();
        linkedList.insertAtFirst(5);
        linkedList.print();
        linkedList.insertAtPos(2,15);
        linkedList.print();
        linkedList.deleteAt(3);
        linkedList.print();
    }
}
