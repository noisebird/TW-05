package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {

        int max = Collections.max(arrayList);
        return max;
    }

    public double getMinimum() {

        int min = Collections.min(arrayList);
        return min;
    }

    public double getAverage() {
        double sum = 0;
        for (int i : arrayList) {
            sum += i;
        }

        return sum / arrayList.size();
    }

    public double getOrderedMedian() {

        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
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

        int even = -1;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                even = i;
                break;
            }
        }
        return even;
    }

    public int getIndexOfFirstEven() {
        int even = getFirstEven();
        int index = arrayList.indexOf(even);
        return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size() == this.arrayList.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != this.arrayList.get(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

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
