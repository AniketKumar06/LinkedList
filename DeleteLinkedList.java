package DSALINKEDLIST;

import DSALINKEDLIST.LinkedList;
import DSALINKEDLIST.LinkedList.Node;
import DSALINKEDLIST.InsertLinkedList;
public class DeleteLinkedList {
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node currentNode = list.head, prev = null;
		
//		 case :01  if head node itself holds the key to be delete
		if(currentNode != null && currentNode.data == key) {
			list.head = currentNode.next;
			
			System.out.println(key +" found and Deleted");
			return list;
			
		}
		
		//case: 02 if the key is somewhere other than at head
		
		while(currentNode != null && currentNode.data != key) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		
		if(currentNode != null) {
			prev.next = currentNode.next;
			System.out.println(key + " found and deleted");
		}
		
//		case:03 if key was not present in linkedList 
		if(currentNode == null) {
			System.out.println(key +" not found");
		}
		
		return list;
	}
	
	
	public static LinkedList deleteByPosition(LinkedList list, int index) {
		
		Node currentNode = list.head , prev = null;
		
		// CASE 1:
        // If index is 0, then head node itself is to be
		
		if(index == 0 && currentNode!= null) {
			list.head = currentNode.next;
			System.out.println(index +"postion is found and deleted");
			return list;
		}
		
		
		 // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
		
		int counter =0;
		while(currentNode != null) {
			if (counter == index) {
				prev.next = currentNode;
				
				System.out.println(index + " position element deleted");
				break;
				
			}else {
				prev = currentNode;
				currentNode = currentNode.next;
				counter++;
			}
		}
		
		 // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currentNode == null) {
            // Display the message
            System.out.println(index + " position element not found");
        }
		
	return list;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertLinkedList list2 = new InsertLinkedList();
		LinkedList list = new LinkedList();
		list = list2.insert(list, 10);
		list = list2.insert(list,13);
		list = list2.insert(list, 3);
		list = list2.insert(list, 12);
		list = list2.insert(list,15);
		list = list2.insert(list,12);
		
		list2.printList(list);
		
		deleteByKey(list,1);
		
		
		list2.printList(list);
		
		deleteByKey(list,10);
		
		list2.printList(list);
		
		deleteByKey(list,15);
		list2.printList(list);
		
		
		
		}
		
	

	}

}
