package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += (num * 3 + 2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            int value = num % 2 == 1 ? num * 3 + 2 : num;
            list.add(value);

        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 1) {
                sum += (num * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        //中位数的求法：若数组位的长度为奇数，则中间的数就是中位数，若数组的长度为偶数，则取中间的两个数求和再除以二就是中位数。
        List<Integer> list=new ArrayList<Integer>();
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        int mid=0;
        int size=arrayList.size();
        if(size%2==0){
           mid=(arrayList.get(size/2-1)+arrayList.get(size/2))/2;
        }else{
            mid=arrayList.get(Math.round(size/2));
        }
        return mid;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int count=0;
        int sum=0;
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if (num % 2 == 0) {
                sum+=num;
                count++;
            }
        }
        return sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list=new ArrayList<Integer>();
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if (num % 2 == 0) {
               list.add(num);
            }
        }
        return list.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list=new ArrayList<Integer>();
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if (num % 2 == 0&&!list.contains(num)) {
                list.add(num);
            }
        }
        return list;

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList=new ArrayList<Integer>();
        List<Integer> oddList=new ArrayList<Integer>();
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if (num % 2 == 0) {
                evenList.add(num);
            }else{
                oddList.add(num);
            }
        }
        Collections.sort(evenList);
        Collections.reverse(oddList);
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int current = arrayList.get(i);
            int next = arrayList.get(i + 1);
            list.add((current + next) * 3);
        }
        return list;
    }
}
