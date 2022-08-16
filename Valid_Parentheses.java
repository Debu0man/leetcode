import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */


class Solution {
    static Map<Character, Character> mappings = new HashMap<>(); // HashMap 클래스를 사용하여 데이터 저장하고 Map 인터페이스를 사용하여 이 클래스의 참조를 보유, 객체 생성
    static { // Map 참조를 사용하여 객체를 보유
        mappings.put('(', ')'); 
        mappings.put('[', ']');
        mappings.put('{', '}');
    }

    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>(); // Stack 객체 생성
        for (int i = 0; i < s.length(); i++) { // 문자열의 길이만큼 반복
            char c = s.charAt(i); // 문자열의 문자 하나하나씩  문자형 변수 생성 및 초기화
            if (mappings.containsKey(c)) { // 문자형 변수에 있는 값이 map안에 있는 key에 있을 시
                parenthesis.push(mappings.get(c)); // 스택에 문자형 변수 값과 동일한 map key의 value를 스택에 저장
            } else if (mappings.containsValue(c)) { // 문자형 변수에 있는 값이 map안에 value중에 있을 시
                if (parenthesis.isEmpty() || parenthesis.pop() != c){ // 스택이 비어 있거나 스택을 추출했을 때 값(문자형 변수의 값과 동일한 map key의 value)이 문자형 변수와 다를 시
                    return false; // false 리턴
                }
            }
        }
        return parenthesis.isEmpty(); // 객체가 비어 있으면 true
    }
}
