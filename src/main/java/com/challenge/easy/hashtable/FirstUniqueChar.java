package com.challenge.easy.hashtable;

import java.util.HashMap;

/**
 * # First Unique Character in a String Given a string s, find the first
 * non-repeating character in it and return its index. If it does not exist,
 * return -1.
 *
 *  *Example 1: Input: s = "leetcode" Output: 0
 *
 *  *Example 2: Input: s = "loveleetcode" Output: 2
 *
 *  *Example 3: Input: s = "aabb" Output: -1
 *
 *
 *  *Constraints:

  ***** 1 <= s.length <= 105 s consists of only lowercase English letters.
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        int index = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(i, String.valueOf(s.charAt(i)));
        }

        for (Integer elem : map.keySet()) {
            if (map.get(elem) != null) {
                String value = map.get(elem);
                map.put(elem, null);
                if (!map.containsValue(value)) {
                    index = elem;
                    break;
                }

                if (value.equals(map.get(elem + 1))) {
                    map.put(elem + 1, null);
                    if (map.size() == elem + 2) {
                        index = -1;
                        break;
                    }
                }
            }

        }

        return index;
    }

    public static void main(String[] args) {
    }
}
