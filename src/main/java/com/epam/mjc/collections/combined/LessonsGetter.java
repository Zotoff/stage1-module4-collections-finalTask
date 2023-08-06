package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        Set<String> keySet = timetable.keySet();
        for (String key : keySet) {
            List<String> list = timetable.get(key);
            for (String str : list) {
                result.add(str);
            }
        }
        return result;
    }
}
