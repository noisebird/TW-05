package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.InputStream;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        return IntStream.range(min, max + 1).filter(item -> item % 2 == 0).sum();


    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        return IntStream.rangeClosed(min, max).filter(item -> item % 2 == 1).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(item -> item * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item % 2 == 1 ? item * 3 + 2 : item).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 1).mapToInt(item -> item * 3 + 5).sum();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        //中位数的求法：若数组位的长度为奇数，则中间的数就是中位数，若数组的长度为偶数，则取中间的两个数求和再除以二就是中位数。
        arrayList = arrayList.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        int mid = 0;
        int size = arrayList.size();
        if (size % 2 == 0) {
            mid = (arrayList.get(size / 2 - 1) + arrayList.get(size / 2)) / 2;
        } else {
            mid = arrayList.get(Math.round(size / 2));
        }
        return mid;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).mapToInt(item -> item).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(item -> item % 2 == 0).collect(Collectors.toList()).contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).distinct().collect(Collectors.toList());

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {


        List<Integer> evenList = arrayList.stream().filter(item -> item % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(item -> item % 2 == 1).sorted((value1, value2) -> value2 - value1).collect(Collectors.toList());
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return IntStream.range(0, arrayList.size() - 1)
                .mapToObj(index -> ((arrayList.get(index) + arrayList.get(index + 1)) * 3))
                .collect(Collectors.toList());

    }
}
