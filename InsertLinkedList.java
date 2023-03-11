package DSALINKEDLIST;

import DSALINKEDLIST.LinkedList.Node;

public class InsertLinkedList {
	public static LinkedList insert(LinkedList list , int data) {
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
			new_node.next = null;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static void printList(LinkedList list) {
		Node currentNode = list.head;
		
		System.out.println("Linked List  :");
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		
		printList(list);

	}

	
}
