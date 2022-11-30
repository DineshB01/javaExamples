package javaclasses;

public class binarysearchtree {
	public static void main(String[] args) {
		BST n=new BST();
		n.add(50);
		n.add(40);
		n.add(45);
		n.add(31);
		n.add(33);
		n.add(60);
		n.add(65);
		n.add(71);
		n.add(73);
		
		n.printval();
	}
}

class BST{
	
	class Node{
		
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
			this.left=null;
			this.right=null;
		}
		
	}
	
	public Node root=null;
	
	void add(int val) {
		root=addNode(root,val);
	}
	
	Node addNode(Node curr,int val) {

		if(curr==null) {
			System.out.println(val);
			return new Node(val);
		}
		if(val>=curr.val) {
			curr.right=addNode(curr.right,val);
		}
		else if(val<curr.val)
			curr.left=addNode(curr.left,val);
		
		return curr;
	}
	
	void printval() {
		Node temp=root;
		printer(temp);
	}
	
	void printer(Node temp) {
		if(temp!=null) {
			System.out.print(temp.val+" ");
			if(temp.right!=null) printer(temp.right);
			if(temp.left!=null) printer(temp.left);
		}
		else
			System.out.println("Null");
		
	}
	
	
}
