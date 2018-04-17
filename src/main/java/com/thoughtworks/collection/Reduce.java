package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(item -> item).average().getAsDouble();
    }

    public double getOrderedMedian() {
        double mid = 0;
        int size = arrayList.size();
        if (size % 2 == 0) {
            mid = (arrayList.get(size / 2 - 1) + arrayList.get(size / 2)) / 2.0;
        } else {
            mid = arrayList.get(Math.round(size / 2));
        }
        return mid;
    }

    public int getFirstEven() {
        return arrayList.stream().filter(item -> item % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int even = getFirstEven();
        return arrayList.indexOf(even);
    }

    public boolean isEqual(List<Integer> arrayLists) {
        Collections.sort(arrayLists);
        Collections.sort(arrayList);
        return arrayLists.stream().allMatch(item -> {
            if (arrayLists.size() != arrayList.size()) {
                return false;
            }
            return arrayList.contains(item);
        });

    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (int item : arrayList) {
            singleLink.addTailPointer(item);
        }
        double mid = 0;
        int size = arrayList.size();
        if (size % 2 == 0) {
            mid = ((Integer) singleLink.getNode(size / 2) + (Integer) singleLink.getNode(size / 2 + 1)) / 2.0;
        } else {
            System.out.println(singleLink.getNode(6));
            mid = (Integer) singleLink.getNode(Math.round(size / 2 + 1));
        }
        return mid;

    }


    public int getLastOdd() {
        int odd = -1;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) % 2 != 0) {
                odd = arrayList.get(i);
                break;
            }
        }
        return odd;
    }

    public int getIndexOfLastOdd() {
        int odd = getLastOdd();
        int index = arrayList.lastIndexOf(odd);
        return index;
    }
}
