/**
9. Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */

class Solution {
    public boolean isPalindrome(int x) {
        
        // 문자열을 뒤집어서 입력받은 문자열과 비교해야겠다고 판단

        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s); // 입력받은 자료형을 StringBuffer 자료형으로 변환(StringBuffer 자료형은 문자열을 추가하거나 변경할 수 있음)
        String reverserS = sb.reverse().toString(); // reverse 함수 이용하여 입력받은 문자열을 뒤집는다

        if (x < 0) {
            return false;
        }
        else if (s.equals(reverserS)){ // equals 함수 이용하여 문자열 비교
            return true;
        }
            
        return false;
    }
}

