package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(item -> item * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return IntStream.rangeClosed(array.get(0), array.get(array.size() - 1)).mapToObj(item -> letters[item - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(item -> {
            String str = "";
            int count = (item - 1) / 26;
            int index = item % 26 == 0 ? 25 : item % 26 - 1;
            if (count > 0) {
                str = letters[count - 1] + letters[index];
            } else {
                str = letters[index];
            }
            return str;
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted((value1, value2) -> value2 - value1).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
