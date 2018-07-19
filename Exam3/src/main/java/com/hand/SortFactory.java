package com.hand;

import java.util.List;
import java.util.Map;

public interface SortFactory {
    Map<Integer,List<Integer>> getList(int size,int bound);
}
