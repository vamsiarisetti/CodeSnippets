package com.org;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOccurredInArray
{
    public static Integer findMaxOccurredInArray(List<Integer> list)
    {
        HashMap<Integer, Integer> listCounter = new HashMap<>();
        list.forEach(ele -> {
            listCounter.put(ele, listCounter.getOrDefault(ele, 0)+1);
        });
        System.out.println(listCounter);
        Integer maxCounter = Collections.max(listCounter.values());

        Integer mostOccurredElement = listCounter.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxCounter))
                .map(Map.Entry::getKey)
                .reduce(0, Integer::sum);
        System.out.println("Most occurred element in array is " + mostOccurredElement +
                " occurred for " + maxCounter +" times.");

        return mostOccurredElement;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 3, 8, 3, 9, 7, 4, 3, 8, 6, 4, 3, 7);
        findMaxOccurredInArray(list);
    }
}
