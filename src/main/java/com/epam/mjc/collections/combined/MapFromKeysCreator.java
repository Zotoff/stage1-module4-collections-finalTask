package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> keySet = sourceMap.keySet();

        for (String key : keySet) {
            int length=key.length();
            if (result.containsKey(length)){
                result.get(length).add(key);
            }else{
                Set<String> set=new HashSet<>();
                set.add(key);
                result.put(length,set);
            }
        }
        return result;
    }
}
