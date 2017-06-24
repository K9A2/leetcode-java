package easy;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 237. Delete Node in a Linked List
 * Problem Address: https://leetcode.com/problems/delete-node-in-a-linked-list/#/description
 * Solution Date: Jun. 24, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should
 * become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}

