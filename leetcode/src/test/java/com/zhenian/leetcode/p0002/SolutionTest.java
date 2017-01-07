package com.zhenian.leetcode.p0002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhenian on 2017/1/7.
 */
public class SolutionTest {

    public static ListNode fromArray(int[] nums){
        ListNode listNode = new ListNode(0);
        ListNode tmp = listNode;
        for(int i=0;i<nums.length;i++){
            tmp.next = new ListNode(nums[i]);
            tmp = tmp.next;
        }
        return listNode.next;
    }

    @Test
    void normalTest() {
        ListNode l1 = fromArray(new int[]{2,4,3});
        ListNode l2 = fromArray(new int[]{5,6,4});
        Solution solution = new Solution();
        ListNode list = solution.addTwoNumbers(l1,l2);
        assertNotNull(list);
        assertEquals(list.val,7);
        assertNotNull(list.next);
        assertEquals(list.next.val,0);
        assertNotNull(list.next.next);
        assertEquals(list.next.next.val,8);
        assertNull(list.next.next.next);
    }
}
