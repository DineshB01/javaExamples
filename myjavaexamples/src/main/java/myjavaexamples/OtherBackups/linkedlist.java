package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

public class linkedlist {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(0);
		list.add(100);
		list.add(98679);
		list.showVal();
		list.showVal();
	}
}

class SinglyLinkedList{
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public Node head=null;
	public Node tail=null;
	
	void add(int val) {
		Node current = new Node(val);
		if(head==null) {
			head = current;
			tail=current;
		}
		else {
			tail.next=current;
			tail=current;
		}
	}
	
	void showVal() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	
}