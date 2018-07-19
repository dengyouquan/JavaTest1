package com.hand;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

public class StreamSortFactory implements SortFactory {
    private static StreamSortFactory ourInstance = new StreamSortFactory();

    public static StreamSortFactory getInstance() {
        return ourInstance;
    }

    private StreamSortFactory() {
    }

    private static List<Integer> RandomList(int num, int bound) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (num-- > 0) {
            list.add(random.nextInt(bound));
        }
        //System.out.println(list.size());
        //System.out.println(list);
        return list;
    }

    Integer key(Integer i){
        return i;
    }

    Integer value(Integer i){
        return i/10;
    }

    @Override
    public Map<Integer, List<Integer>> getList(int size, int bound) {
        Random random = new Random();
        //get List
        IntStream stream = random.ints(size, 0, bound);
        List<Integer> keyList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> valueList = RandomList(size, bound);
        //System.out.println(valueList.stream().collect(Collectors.toMap(key->key(key),value->value(value))));
        return null;
    }
}
