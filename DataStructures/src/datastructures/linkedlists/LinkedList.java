package datastructures.linkedlists;

public class LinkedList {

	public static ListNode head;
	
	public void addFirst(int data) {
		if(head == null)
			head = new ListNode(data);
		else {
			ListNode newNode = new ListNode(data);
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void addLast(int data) {
		ListNode newNode = new ListNode(data);
		ListNode currentNode = head;
		while(currentNode.getNext() != null)
			currentNode = currentNode.getNext();
		currentNode.setNext(newNode);
	}
	
	public void addInMiddle(int data, int pos) {
		ListNode newNode = new ListNode(data);
		ListNode currentNode;
		ListNode prevNode = head;
		if(pos <= LinkedList.size()) {
			for(int i=1; i<(pos-1); i++)
				prevNode = prevNode.getNext();
		}
		currentNode = prevNode.getNext();
		prevNode.setNext(newNode);
		newNode.setNext(currentNode);
	}
	
	public void deleteFirst() {
		ListNode currentNode = head;
		currentNode = currentNode.getNext();
		head = currentNode;
		currentNode = null;
	}
	
	public void deleteLast() {
		ListNode currentNode = head;
		for(int i=1; i<(LinkedList.size()-1); i++)
			currentNode = currentNode.getNext();
		currentNode.setNext(null);
	}
	
	public void deleteFromMiddle(int pos) {
		ListNode prevNode = head;
		for(int i=1; i<(pos-1); i++)
			prevNode = prevNode.getNext();
		ListNode currentNode = prevNode.getNext();
		prevNode.setNext(currentNode.getNext());
	}
	
	public static int size() {
		int length = 0;
		ListNode currentNode = head;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	public void printList() {
		ListNode currentNode = head;
		System.out.print("Elements in the list are : ");
		while(currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext(); 
		}
	}
	
	public void viewList(ListNode head) {
		if(head != null) {
			System.out.print(head.getData() + " ");
			viewList(head.getNext());
		}
		
	}
	
	public int findNthNodeFromLast(int n) {
		ListNode currentNode = head;
		int posFromStart = LinkedList.size() - n + 1;
		for(int i=1; i<(posFromStart); i++)
			currentNode = currentNode.getNext();
		int data = currentNode.getData();
		return data;
			
	}
	
	public void printListInReverse(ListNode currentNode){
		if(currentNode == null)
			return;
		printListInReverse(currentNode.getNext());
		System.out.print(currentNode.getData() + " ");
	}
	
	public ListNode findHeadNode() {
		return head;
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		while(current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next	;
		}
		head = prev;
		return head;
	}
	
	
}
