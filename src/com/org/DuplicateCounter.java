package com.org;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class DuplicateCounter {

    public static HashMap<Integer, Integer> getNumberOfDuplicateElements(List<Integer> list)
    {
        HashMap<Integer, Integer> duplicateCounterMap = new HashMap<>();
        list.forEach(num -> {
            Integer counter = duplicateCounterMap.getOrDefault(num, 0);
            duplicateCounterMap.put(num, counter+1);
        });
        return duplicateCounterMap;
    }

    public static Integer getSumOfList(List<Integer> list)
    {
        return list.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 2, 3, 4, 5);
        System.out.println(getNumberOfDuplicateElements(list));
        System.out.println(getSumOfList(list));
    }
}
