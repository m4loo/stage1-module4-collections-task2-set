package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        for (String o1 : firstSet) {
            if (secondSet.contains(o1) && !thirdSet.contains(o1)) resultSet.add(o1);
        }
        for (String o2 : thirdSet) {
            if (!firstSet.contains(o2) && !secondSet.contains(o2)) resultSet.add(o2);
        }

        return resultSet;
    }
}
