package com.zhenian.leetcode.p0003;

import java.util.HashMap;

/**
 * Created by zhenian on 2017/1/7.
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        if(s != null){
            int currentIndex = 0;
            // char and max index of the char
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    currentIndex = Math.max(map.get(s.charAt(i)), currentIndex);
                }
                len = Math.max(len, i - currentIndex + 1);
                map.put(s.charAt(i), i + 1);
            }
        }
        return len;
    }
}
