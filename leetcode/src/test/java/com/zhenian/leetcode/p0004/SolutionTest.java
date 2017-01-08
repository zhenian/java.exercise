package com.zhenian.leetcode.p0004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhenian on 2017/1/7.
 */
public class SolutionTest {

    @Test
    void normalTest(){
        Solution solution = new Solution();
        double r1 = solution.findMedianSortedArrays(new int[]{1,3},new int[]{2});
        assertEquals(r1,2.0);
        double r2 = solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4});
        assertEquals(r2,2.5);

    }
}
