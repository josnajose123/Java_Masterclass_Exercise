package com.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get element
        int element= list.get(2);
        System.out.println(element);
        //add in between
        list.add(1,2);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);
        // delete elements
        list.remove(2);
        System.out.println(list);
        //to get array size
        System.out.println(list.size());
        //loops
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
