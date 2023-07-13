package com.Collections;

public class LinkedList {
    Node head; // first node
    public void insert(int data)
    {
        Node node = new Node();
        node.data =data;
        node.next=null;
        if(head == null) //no elements in the list
        {
            head = node;
        }
        else {
            Node n= head; // assign the value of head to n
            while(n.next!= null) // iterate till last element
            {
                n= n.next;
            }
            n.next = node; //add new element to the end of the list

        }
    }
    public void print(){ // to print elements
        Node node = head;
        while(node.next!= null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtFirst(int data)//insert at first position
    {
        Node node = new Node();
        node.data =data;
        node.next =head;
        head =node;
    }
    public void insertAtPos(int index,int data)
    {
        Node node = new Node();
        node.data =data;
        node.next=null;
        if(index== 0)
        {
            insert(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else {
            Node n= head;
            Node n1= null;
            for(int i =0;i<index-1;i++){
                n=n.next;
            }
            n1= n.next;
            n.next=n1.next;
        }
    }
}
