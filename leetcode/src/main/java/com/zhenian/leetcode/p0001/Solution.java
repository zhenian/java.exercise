package com.zhenian.leetcode.p0001;

import java.util.HashMap;

/**
 * Created by zhenian on 2017/1/7.
 *
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i=0; i<nums.length; i++){
            int l = target - nums[i];
            if(map.containsKey(l) && map.get(l) != i){
                return new int[]{i,map.get(l)};
            }
        }
        throw new IllegalArgumentException("No Results");
    }
}
