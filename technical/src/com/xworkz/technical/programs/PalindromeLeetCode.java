package com.xworkz.technical.programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class PalindromeLeetCode {
	public void isPalindrome() {
		return 
	}
	public static void main(String[] args) {
	    public boolean isPalindrome(ListNode head) {
	        Collection<Integer> vals = new ArrayList<>();

	        // Convert LinkedList into ArrayList.
	        ListNode currentNode = head;
	        while (currentNode != null) {
	            vals.add(currentNode.val);
	            currentNode = currentNode.next;
	        }

	        // Use two-pointer technique to check for palindrome.
	        int front = 0;
	        int back = vals.size() - 1;
	        while (front < back) {
	            // Note that we must use ! .equals instead of !=
	            // because we are comparing Integer, not int.
	            if (!vals.get(front).equals(vals.get(back))) {
	                return false;
	            }
	            front++;
	            back--;
	        }
	        return true;
	    }
	}
}
