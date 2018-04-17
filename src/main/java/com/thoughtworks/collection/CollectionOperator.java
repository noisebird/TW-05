package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int max = left > right ? left : right;
        int min = left > right ? right : left;
        List<Integer> list = IntStream.rangeClosed(min, max).mapToObj(item -> item).collect(Collectors.toList());
        if (left > right) {
            Collections.reverse(list);
        }
        return list;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int max = left > right ? left : right;
        int min = left > right ? right : left;
        List<Integer> list = IntStream.rangeClosed(min, max).filter(item -> item % 2 == 0).mapToObj(item -> item).collect(Collectors.toList());
        if (left > right) {
            Collections.reverse(list);
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(item -> item % 2 == 0).mapToObj(item -> item).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(firstArray).forEach(item->{
            for (int j : secondArray) {
                if (item == j) {
                    list.add(item);
                }
            }
        });
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list =Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> secondList=Arrays.stream(secondArray).collect(Collectors.toList());
        list.addAll(secondList);
        return list.stream().distinct().collect(Collectors.toList());
    }
}
