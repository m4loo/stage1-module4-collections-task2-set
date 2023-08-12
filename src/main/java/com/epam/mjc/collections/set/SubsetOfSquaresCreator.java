package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> resultSet = new HashSet<>();

        if (sourceList.isEmpty()) return resultSet;

        int square;

        for (int sourceNum : sourceList) {
            square = sourceNum * sourceNum;
            treeSet.add(square);
            if (square >= lowerBound && square <= upperBound) resultSet.add(square);
        }
        return resultSet;
    }
}
