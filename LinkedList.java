package DSALINKEDLIST;

import DSALINKEDLIST.LinkedList.Node;

public class LinkedList {
		Node head;
		
		static class Node{
			int data;
			Node next;
			
			Node(int d){
				data = d;
				next = null;
			}
	}
//	 Pushing Element in first Element
		/*
		 Time complexity : O(1)
		 Auxiliary Space: O(1)
		 */
		public void push (int new_data) {
			Node new_node = new Node(new_data);
			
			new_node.next = head;
			
			head.data = new_data;
		}
	
	//Add a node after a given node
		/*
		 * Time Complexity : O(1)
		 * Auxiliary Space :O(1)
		 */
		
		public void insertAfter(Node prev, int new_data) {
			if(prev == null) {
				System.out.println("The given previous node cannot be null");
				return;
			}
			
			Node new_node = new Node(new_data);
			new_node.next = prev.next;
			prev.next = new_node;
			
		}

		
//		 Add a node at the end
		/*
		 * Time Complexity : O(N)
		 * Auxiliary Space :O(1)
		 */
		
		public void append(int new_data) {
			Node node = new Node(new_data);
			if(head == null) {
				head = new Node(new_data);
				return;
			}
			node.next = null;
			Node last = head;
			while(last.next != null)
				last = last.next;
			
			last.next= node;
			return;
			
		}
		
}
