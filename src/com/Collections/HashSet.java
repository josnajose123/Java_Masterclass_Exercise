package com.Collections;

import java.util.*;
import java.util.ArrayList;

public class HashSet {
    public static void main(String[] args) {
        System.out.println("HASHSET");
        Set<String> names = new java.util.HashSet<>();
        names.add("Josna");
        names.add("Jose");
        names.add("Joseph");
        names.add("Jeslin");
        names.add("Joel");
        names.add("Josna");
        System.out.println(names);
        names.remove("Joseph");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Joseph"));
        System.out.println(names.contains("Jose"));
        System.out.println(names.isEmpty());
        for(String name :names)
        {
            System.out.println(name);
        }
        names.clear();
        System.out.println(names);
        List<Integer> numberList =new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(4);
        System.out.println(numberList);
        Set<Integer> numberSet = new java.util.HashSet<>();
        numberSet.addAll(numberList); // adding all list elements to set
        System.out.println(numberSet);



        //  TREE SET
        System.out.println("TREESET");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("dd");
        treeSet.add("bb");
        treeSet.add("aa");
        treeSet.add("cc");
        treeSet.add("cc");
        System.out.println(treeSet);
        treeSet.remove("cc");
        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.contains("dd"));

        //LINKED HASHSET
        System.out.println("LINKED HASHSET");
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(50);
        linkedHashSet.add(20);
        linkedHashSet.add(40);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(30);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.contains(50));


    }
}
