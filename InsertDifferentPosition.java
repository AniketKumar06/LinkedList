package DSALINKEDLIST;

import DSALINKEDLIST.LinkedList;
import DSALINKEDLIST.LinkedList.Node;
import DSALINKEDLIST.InsertLinkedList;
public class InsertDifferentPosition {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		InsertLinkedList list2 = new InsertLinkedList();
		
		for(int i =2;i<=10;i++) {
			list = list2.insert(list, i);
		}
		
		list2.printList(list);  // print linkedlist 
		
		list.push(200); // push linkedList 
		list2.printList(list);
		 
		list.insertAfter(list.head, 100); //insert at position in linked List
		list2.printList(list);
		
		
		list.append(109);// insert element in last in linkedlist
		list2.printList(list);  //printing linked list
		
		

	}

}
