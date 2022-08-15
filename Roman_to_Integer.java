/**
 13. Roman to Integer

 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
 */


class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int before = 0;
        int[] numberArr = new int[s.length()];
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'I'){
                numberArr[i] = 1;
            }else if(arr[i] == 'V'){
                numberArr[i] = 5;
            }else if(arr[i] == 'X'){
                numberArr[i] = 10;
            }else if(arr[i] == 'L'){
                numberArr[i] = 50;
            }else if(arr[i] == 'C'){
                numberArr[i] = 100;
            }else if(arr[i] == 'D'){
                numberArr[i] = 500;
            }else if(arr[i] == 'M'){
                numberArr[i] = 1000;
            }
        }

        
        for(int i = numberArr.length-1; i >= 0; i--){ // 변환된 숫자 배열을 배열 뒷 부분 값부터 확인
            if(numberArr[i] < before){ // 확인하면서 배열 앖의 값 보다 숫자가 더 낮을 시 
                sum -= numberArr[i]; // 현재 배열의 앞의 값에서 현재 배열 값을 뺀 후 총합에 더함
            }else {
                sum += numberArr[i]; // 앞의 값보다 높거나 같을 경우는 그냥 총합에 더함
                before = numberArr[i];
            }
        }
        return sum; // 총합 리턴
    }
}
