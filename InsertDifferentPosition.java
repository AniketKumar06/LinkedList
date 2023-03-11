package DSALINKEDLIST;

import DSALINKEDLIST.LinkedList;
import DSALINKEDLIST.LinkedList.Node;
import DSALINKEDLIST.InsertLinkedList;
public class InsertDifferentPosition {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		InsertLinkedList list2 = new InsertLinkedList();
		
		list = list2.insert(list, 12);
		list = list2.insert(list, 14);
		list = list2.insert(list, 15);
		list = list2.insert(list,20);
		list = list2.insert(list,48);
		list = list2.insert(list, 150);
		
		list2.printList(list);  // print linkedlist 
		
		list.push(200); // push linkedList 
		list2.printList(list);
		 
		list.insertAfter(list.head, 100); //insert at position in linked List
		list2.printList(list);
		
		
		list.append(109);// insert element in last in linkedlist
		list2.printList(list);  //printing linked list
		
		

	}

}
