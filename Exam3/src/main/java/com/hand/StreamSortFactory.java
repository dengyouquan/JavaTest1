package com.hand;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

class MyEntry{
    private int key;
    private int value;
    public MyEntry(int key,int value) {
        this.key = key;
        this.value = value;
    }
}

public class StreamSortFactory implements SortFactory {
    private static StreamSortFactory ourInstance = new StreamSortFactory();

    public static StreamSortFactory getInstance() {
        return ourInstance;
    }

    private StreamSortFactory() {
    }

    @Override
    public Map<Integer, List<Integer>> getList(int size, int bound) {
        Random random = new Random();
        Map<Integer, List<Integer>> map = random.ints(size, 0, bound).boxed().sorted().collect(Collectors.groupingBy(value->value/10));
        return map;
    }
}
