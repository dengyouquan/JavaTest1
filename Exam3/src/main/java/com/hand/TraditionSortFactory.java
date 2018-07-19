package com.hand;

import java.util.*;

public class TraditionSortFactory implements SortFactory {
    private static TraditionSortFactory ourInstance = new TraditionSortFactory();

    public static TraditionSortFactory getInstance() {
        return ourInstance;
    }

    private TraditionSortFactory() {
    }

    private void sortByJava7(List<Integer> names){
        Collections.sort(names, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }
        });
    }

    private void customsortByJava7(List<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }

    private static List<Integer> RandomList(int num,int bound) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (num-->0){
            list.add(random.nextInt(bound));
        }
        //System.out.println(list.size());
        //System.out.println(list);
        return list;
    }

    @Override
    public Map<Integer, List<Integer>> getList(int size,int bound) {
        //get List
        List<Integer> list = RandomList(size,bound);
        //get Map
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            int value = list.get(i);
            int key = value/10;
            if(map.containsKey(key)){
                List<Integer> tempList = map.get(key);
                tempList.add(value);
                map.put(key,tempList);
            }else{
                List<Integer> tempList = new ArrayList<>();
                tempList.add(value);
                map.put(key,tempList);
            }
        }
        //System.out.println(map);
        //sort List
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> tempList = entry.getValue();
            customsortByJava7(tempList);
            entry.setValue(tempList);
        }
        return map;
    }
}
