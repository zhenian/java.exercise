package com.zhenian.leetcode.p0003;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by zhenian on 2017/1/7.
 */
public class SolutionTest {

    @Test
    void test1(){
        Solution solution = new Solution();
        assertEquals(solution.lengthOfLongestSubstring("abcabcbb"),3);
        assertEquals(solution.lengthOfLongestSubstring("bbbbb"),1);
        assertEquals(solution.lengthOfLongestSubstring("pwwkew"),3);
    }
}
