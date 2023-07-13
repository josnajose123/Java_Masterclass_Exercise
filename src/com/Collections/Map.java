package com.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        System.out.println("HASHMAP");

        HashMap<String,Integer> employees= new HashMap<>();

        employees.put("Josna",123);
        employees.put("John",223);
        employees.put("Jose",323);
        employees.put("Joel",423);
        employees.put("Josna",124);
        System.out.println(employees);
        System.out.println(employees.get("Jose"));
        employees.replace("Josna",324);
        employees.putIfAbsent("George",765);
        System.out.println(employees.isEmpty());
        System.out.println(employees.containsKey("Josna"));;
        System.out.println(employees.containsValue(323));
        for(String name: employees.keySet())
        {
            System.out.println(name+" : "+employees.get(name));
        }



        //TREEMAP
        System.out.println("TREEMAP");
        TreeMap<String,Integer> treeMap= new TreeMap<>();

        treeMap.put("bb",123);
        treeMap.put("cc",223);
        treeMap.put("dd",323);
        treeMap.put("bb",423);
        treeMap.put("aa",124);
        System.out.println(employees);
        System.out.println(employees.get("bb"));
        employees.replace("cc",324);
        employees.putIfAbsent("ff",765);
        System.out.println(employees.isEmpty());
        System.out.println(employees.containsKey("zz"));;
        System.out.println(employees.containsValue(323));
        for(String name: treeMap.keySet())
        {
            System.out.println(name+" : "+treeMap.get(name));
        }

        //LINKEDHASHMAP
        System.out.println("LINKEDHASHMAP");
        LinkedHashMap<String,Integer> linkedHashMap= new LinkedHashMap<>();

        linkedHashMap.put("bb",123);
        linkedHashMap.put("cc",223);
        linkedHashMap.put("dd",323);
        linkedHashMap.put("bb",423);
        linkedHashMap.put("aa",124);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("bb"));
        linkedHashMap.replace("cc",324);
        linkedHashMap.putIfAbsent("ff",765);
        System.out.println(linkedHashMap.isEmpty());
        System.out.println(linkedHashMap.containsKey("zz"));;
        System.out.println(linkedHashMap.containsValue(323));
        for(String name: treeMap.keySet())
        {
            System.out.println(name+" : "+linkedHashMap.get(name));
        }







    }
}
