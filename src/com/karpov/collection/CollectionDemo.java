package com.karpov.collection;

import java.util.*;
import java.util.function.Consumer;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("karpov");
        c1.add("karpov98");
        c2.add("逆天邪神");
        c2.add("斗破苍穹");
        c1.addAll(c2);
        System.out.println(c1);
        c1.toString();
        Iterator<String> it = c1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------");
        for (String s : c1) {
            System.out.println(s);
        }

        System.out.println("-------");
        c1.forEach(s ->{
            System.out.println(s);
        });
        XXXXX









    }
}
