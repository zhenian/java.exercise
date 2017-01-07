package com.zhenian.leetcode.p0001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhenian on 2017/1/7.
 */

public class SolutionTest {
    @Test
    void normalTest() {
        int[] nums = new int[]{3,2,2,3,4};
        int target = 6;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,target);
        assertEquals(result.length,2);
        assertEquals(result[0],0);
        assertEquals(result[1],3);
    }
}
