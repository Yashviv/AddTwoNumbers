package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testAddTwoNumbers() {
        Solution1 solution = new Solution1();

        // Test case: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 807
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testOneListIsEmpty() {
        Solution1 solution = new Solution1();

        // Test case: null + (1 -> 2 -> 3) = 1 -> 2 -> 3
        ListNode l1 = null;
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testBothListsAreEmpty() {
        Solution1 solution = new Solution1();

        // Test case: null + null = null
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode expected = null;

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testDifferentLengthsWithCarry() {
        Solution1 solution = new Solution1();

        // Test case: (9 -> 9) + (1) = 0 -> 0 -> 1
        ListNode l1 = new ListNode(9, new ListNode(9));
        ListNode l2 = new ListNode(1);
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(1)));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testLargeNumbersWithMultipleCarries() {
        Solution1 solution = new Solution1();

        // Test case: (9 -> 9 -> 9 -> 9 -> 9) + (1) = 0 -> 0 -> 0 -> 0 -> 0 -> 1
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        ListNode l2 = new ListNode(1);
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testSingleNodeLists() {
        Solution1 solution = new Solution1();

        // Test case: (5) + (5) = 0 -> 1
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode expected = new ListNode(0, new ListNode(1));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public void testAllZeros() {
        Solution1 solution = new Solution1();

        // Test case: (0 -> 0 -> 0) + (0 -> 0) = 0 -> 0 -> 0
        ListNode l1 = new ListNode(0, new ListNode(0, new ListNode(0)));
        ListNode l2 = new ListNode(0, new ListNode(0));
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(0)));

        assertEquals(toString(expected), toString(solution.addTwoNumbers(l1, l2)));
    }

    // Helper method to convert ListNode to String for easy comparison and printing
    private String toString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            node = node.next;
            if (node != null) sb.append(" -> ");
        }
        return sb.toString();
    }
}
