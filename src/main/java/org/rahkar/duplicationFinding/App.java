package org.rahkar.duplicationFinding;


import org.rahkar.duplicationFinding.util.DuplicationFinder;

import java.util.ArrayList;
import java.util.HashSet;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(null);
        arrayList.add(8);
        HashSet<Integer> dup = DuplicationFinder.getInstance().findDuplicate(arrayList);
        dup.forEach(System.out::println);
    }
}
