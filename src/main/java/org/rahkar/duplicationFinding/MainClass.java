package org.rahkar.duplicationFinding;

import java.util.ArrayList;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args){
        System.out.println("hello");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(8);
        HashSet<Integer> dup = DuplicationFinder.getInstance().findDuplicate(arrayList);
        dup.forEach(System.out::println);
        dup.clear();
        dup = DuplicationFinder.getInstance().findDuplicate(arrayList);
        dup.forEach(System.out::println);
    }
}
