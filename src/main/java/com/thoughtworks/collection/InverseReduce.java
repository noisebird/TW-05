package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list =new ArrayList<Integer>();
        int num=random.nextInt(3);
        while(number-num>0){
            list.add(number-num);
            number=number-num;
        }
        return list;
    }


}
