package com.zhenian.leetcode.p0004;


/**
 * Created by zhenian on 2017/1/7.
 * <p>
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        if (total % 2 == 1) {
            return findNNumber(nums1, nums2, total / 2 + 1);
        }
        return (findNNumber(nums1, nums2, total / 2)
                + findNNumber(nums1, nums2, total / 2 + 1)) / 2.0;
    }

    // find the index n number in the two sorted array
    public static int findNNumber(int[] a, int[] b, int n) {
        return findNNumber(a, 0, b, 0, n);
    }

    private static int findNNumber(int[] a, int beginA, int[] b, int beginB, int n) {
        if (beginA >= a.length) {
            return b[beginB + n - 1];
        }
        if (beginB >= b.length) {
            return a[beginA + n - 1];
        }
        if (n == 1) {
            return Math.min(a[beginA], b[beginB]);
        }

        int indexA = beginA + n / 2 - 1 < a.length ? a[beginA + n / 2 - 1] : Integer.MAX_VALUE;
        int indexB = beginB + n / 2 - 1 < b.length ? b[beginB + n / 2 - 1] : Integer.MAX_VALUE;
        if (indexA < indexB) {
            return findNNumber(a, beginA + n / 2, b, beginB, n - n / 2);
        } else {
            return findNNumber(a, beginA, b, beginB + n / 2, n - n / 2);
        }
    }
}
