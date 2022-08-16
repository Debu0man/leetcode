/**
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) 
            return ""; // 배열에 아무런 값 없을 시 "" 리턴
        
        String prefix = strs[0]; // strs배열의 첫번째 값을 기준으로 잡음
        
        for (int i = 1; i < strs.length; i++) { 
            while (strs[i].indexOf(prefix) != 0) { // prefix와 비교하여 i번째 배열 값에 prefix가 있을 때 까지 반복(배열값에 prefix값이 없으면 -1을 반환, 배열값에 prefix 값이 있으면 0반환)
                prefix = prefix.substring(0, prefix.length() - 1); // 배열값에 prefix가 없으면 prefix값의 마지막 char을 제거
                if (prefix.isEmpty()) 
                    return ""; // prefix 값이 없으면 "" 리턴
            }
        }

        return prefix; // prefix값 리턴
    }
}
