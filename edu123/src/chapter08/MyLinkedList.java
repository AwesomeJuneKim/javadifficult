package chapter08;

public class MyLinkedList {

	private Node head;
	private class Node{
		private String data;
		private Node link;
		
		public Node(String data) {
			this.data=data; link=null;// 원래하던 방식?
		}
	}
	public void add(String data) {
		Node newNode= new Node(data);
		if(head==null)
			head= newNode;
	}
	public MyLinkedList(Node head) {
		this.head=head;
	}

}
