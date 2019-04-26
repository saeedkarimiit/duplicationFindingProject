package org.rahkar.duplicationFinding;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicationFinder {
    private static DuplicationFinder duplicationFinder = null;
    private HashSet<Integer> checkHashSet = null;
    private HashSet<Integer> outPutHashSet = null;


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

    private void checkDup(int n){
        if (checkHashSet.contains(n))
            outPutHashSet.add(n);
        else
            checkHashSet.add(n);
    }
}
