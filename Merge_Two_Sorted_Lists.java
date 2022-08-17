/**
 21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null && list2 == null) { // list1 과 list2 둘다 비어 있으면 list1(list2) 리턴
            return list1;
        }else if(list1 == null) { // list1만 비어 있으면 list2 리턴
            return list2;
        }else if(list2 == null) { // list2만 비어 있으면 list1 리턴
            return list1;
        }

        ListNode rootNode = new ListNode(); // root 노드 객체 생성
        ListNode headNode = rootNode; // 루트 노드의 주소를 가지는 head 노드 생성

        while(!(list1 == null && list2 == null)) { // list1과 list2가 null일 때 까지 반복
            
            int val1 = list1 != null ? list1.val : 999; // 변수 val1 val2에 list1, list2의 값을 저장, null일 경우 노드의 값 범위를 벗어나는 999 저장
            int val2 = list2 != null ? list2.val : 999;
            
            ListNode newNode = new ListNode(); // root 노드에 이어 붙일 새로운 노드 객체 생성
            
            if(val1 < val2) { // val1의 값보다 val2의 값이 더 크면  
                newNode.val = val1; // val1을 newNode 객체에 할당
                list1 = list1.next; // list1의 주소를 현재 노드와 연결된 다음 노드의 주소로 변경
            } else {
                newNode.val = val2;
                list2 = list2.next;
            }

            rootNode.next = newNode; // root 노드의 next에 newNode 연결
            rootNode = rootNode.next; // root 노드를 현재 노드의 주소를 연결된 다음 노드의 주소로 변경
        }

        return headNode.next;
    }
}
