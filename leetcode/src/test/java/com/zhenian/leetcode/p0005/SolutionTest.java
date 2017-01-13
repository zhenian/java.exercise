package com.zhenian.leetcode.p0005;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhenian on 2017/1/10.
 */

public class SolutionTest {
    @Test
    void normalTest(){
        Solution solution = new Solution();
        String s = solution.longestPalindrome("babad");
        // bab aba
        assertNotNull(s);
        assertEquals(s,"bab");
        //assertEquals(s,"aba");
        String s2 = solution.longestPalindrome("cbbd");
        assertNotNull(s2);
        assertEquals(s2,"bb");
    }
}
