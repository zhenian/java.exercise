package com.zhenian.leetcode.p0002;

/**
 * Created by zhenian on 2017/1/7.
 * https://leetcode.com/problems/add-two-numbers/
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);

        ListNode x = l1;
        ListNode y = l2;
        ListNode tmp = listNode;

        int val = 0;
        while (x != null || y != null){
            int xVal = x==null?0:x.val;
            int yVal = y==null?0:y.val;
            int sum = val + xVal + yVal;

            val = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
            if(x != null) x = x.next;
            if(y != null) y = y.next;
        }
        if(val > 0){
            tmp.next = new ListNode(val);
        }
        return listNode.next;
    }
}
