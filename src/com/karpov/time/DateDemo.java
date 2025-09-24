package com.karpov.time;

import sun.reflect.generics.tree.Tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BiConsumer;

public class DateDemo {
    public static void main(String[] args) {

        Map<String,List<String>> maps = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        maps.put("karpov", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        maps.put("SHY", list2);
        System.out.println(maps);
        Collection<List<String>> values = maps.values();
        System.out.println(values);
        Map<String,Integer> maps1 = new HashMap<>();
        for (List<String> value : values) {
            for (String s : value) {
                if (maps1.containsKey(s)) {
                    maps1.put(s, maps1.get(s) + 1);
                } else {
                    maps1.put(s, 1);
                }
            }
        }
        System.out.println(maps1);


       

    }
}