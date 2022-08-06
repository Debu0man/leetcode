/**
 * 
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) { //target값에서 배열i번 인덱스의값을 뺀 결과 값이 i+1번인덱스의 값과 같은지 비교
                    return new int[] {i, j}; // 같다면 i번 인덱스와 i+1번 인덱스를 리턴
                }
            }
        }
        return null; //리턴값이 있어야 하는 함수이므로 해당되는 리턴값 없으면 null반환
    }
}