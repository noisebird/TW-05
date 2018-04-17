package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(array).forEach(item->{
            for(int i=0;i<item.length;i++) {
                list.add(item[i]);
            }
        });
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(array).forEach(item->{
            for (int j = 0; j < item.length; j++) {
                if(!list.contains(item[j])){
                    list.add(item[j]);
                }
            }
        });
        return list;

    }
}
