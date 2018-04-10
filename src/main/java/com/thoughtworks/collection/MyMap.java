package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            list.add(i * 3);
        }
        return list;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<String>();
        for (int i : array) {
            list.add(letters[i - 1]);
        }
        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<String>();
        for (int i : array) {
            String str = "";
            int count = (i - 1) / 26;
            int index = i % 26 == 0 ? 25 : i % 26 - 1;
            if (count > 0) {
                str = letters[count - 1] + letters[index];
            } else {
                str = letters[index];
            }

            list.add(str);
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list=new ArrayList<Integer>();
        list.addAll(array);
        Collections.reverse(list);

        return list;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> list=new ArrayList<Integer>();
        list.addAll(array);
        Collections.sort(array);
        return array;
    }
}
