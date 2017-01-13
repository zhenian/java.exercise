package com.zhenian.leetcode.p0005;

import java.util.Arrays;

/**
 * Created by zhenian on 2017/1/10.
 * https://leetcode.com/problems/longest-palindromic-substring/
 */

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null){
            return null;
        }
        String str = convert(s);

        int [] rad = new int[str.length()];
        int right = -1;
        int id = -1;
        for (int i = 0; i < str.length(); i ++) {
            int r = 1;
            if (i <= right) {
                r = Math.min(rad[id] - i + id, rad[2 * id - i]);
            }
            while (i - r >= 0 && i + r < str.length() && str.charAt(i - r) == str.charAt(i + r)) {
                r++;
            }
            if (i + r - 1> right) {
                right = i + r - 1;
                id = i;
            }
            rad[i] = r;
        }

        //System.out.println(s);
        //System.out.println(str);
        int maxLength = 0;
        int index = 0;
        //StringBuilder sb = new StringBuilder();
        for(int i=0;i<rad.length;i++){
            int r = rad[i];
            //if(i!=0){
            //    sb.append(",");
            //}
            //sb.append(r-1);
            if(r>maxLength){
                maxLength = r;
                index = i;
            }
        }
        maxLength = maxLength -1;

        //System.out.println("["+sb.toString()+"]");
        //System.out.println("("+index+","+maxLength+")");

        int st = (index - maxLength) / 2;
        //System.out.println("("+st+","+(st + maxLength )+")");
        return s.substring(st, st + maxLength );
    }

    private static String convert(String s){
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char c : chars){
            sb.append("#").append(c);
        }
        sb.append("#");
        return sb.toString();
    }


    public static void main(String[] args){
        Solution solution = new Solution();
        String s = solution.longestPalindrome("babad");
        System.out.println("====>"+s);
        String s2 = solution.longestPalindrome("cbbd");
        System.out.println("====>"+s2);

    }

}

/*

 b a b a d
[1,3,3,1,1]
#b#a#b#a#d#
[0,1,0,3,0,3,0,1,0,1,0]
(3,3)

 c b b d
[1,1,2,1,1]
#c#b#b#d##
[0,1,0,1,2,1,0,1,0]
(4,3)
* */
