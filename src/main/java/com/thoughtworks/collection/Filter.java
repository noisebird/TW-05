package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 3 == 0) {
                list.add(num);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : firstList) {
            if(secondList.contains(i)){
                list.add(i);
            }
        }
        return list;

    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}