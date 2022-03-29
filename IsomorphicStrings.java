package com.caltinsoy.interviewquest;

import java.util.HashMap;

public class IsomorphicStrings {

    private boolean isIsomorphic(String first, String second) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            if (map.containsKey(first.charAt(i))) {
                if (map.get(first.charAt(i)) != second.charAt(i)) {
                    return false;
                }
            } else if (map.containsValue(second.charAt(i))) {
                return false;
            } else {
                map.put(first.charAt(i), second.charAt(i));
            }
        }
        return true;
    }
}
