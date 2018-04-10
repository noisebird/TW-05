package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        int max = left > right ? left : right;
        int min = left > right ? right : left;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        if (left > right) {
            Collections.reverse(list);
        }
        return list;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        List<Integer> list = new ArrayList<Integer>();
        int max = left > right ? left : right;
        int min = left > right ? right : left;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        if (left > right) {
            Collections.reverse(list);
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList=Arrays.asList(firstArray);
        List<Integer> secondList=Arrays.asList(secondArray);
        List<Integer> list=new ArrayList<Integer>();
        list.addAll(firstList);
        for(int i :secondList){
            if(!firstList.contains(i)){
                list.add(i);
            }

        }
        return list;
    }
}
