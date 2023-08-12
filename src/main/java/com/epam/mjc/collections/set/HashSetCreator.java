package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> result = new HashSet<>();
        for (int x: sourceList) {
            int buff = x;

            if (x%2 == 0) {
                while (buff%2 == 0){
                    result.add(buff);
                    buff /= 2;
                }
                result.add(buff);
            }else {
                result.add(x);
                result.add(x*2);
            }
        }
        return result;
    }
}
