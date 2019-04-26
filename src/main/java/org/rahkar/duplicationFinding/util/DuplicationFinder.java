package org.rahkar.duplicationFinding.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class DuplicationFinder {
    private static DuplicationFinder duplicationFinder = null;
    private HashSet<Integer> checkHashSet;
    private HashSet<Integer> outPutHashSet;


     public static DuplicationFinder getInstance(){
        if (duplicationFinder == null)
            duplicationFinder = new DuplicationFinder();
        return duplicationFinder;
    }

    public HashSet<Integer> findDuplicate(ArrayList<Integer> inputArray){
        if (checkHashSet==null)
            checkHashSet = new HashSet<>();
        else
            checkHashSet.clear();
        if (outPutHashSet==null)
            outPutHashSet = new HashSet<>();
        else
            outPutHashSet.clear();
        inputArray.forEach(duplicationFinder::checkDup);
        return outPutHashSet;
    }

    private void checkDup(Integer n){
        Optional<Integer> value = Optional.ofNullable(n);
         if (value.isPresent()){
             if (checkHashSet.contains(n))
                 outPutHashSet.add(n);
             else
                 checkHashSet.add(n);
         }
    }
}
