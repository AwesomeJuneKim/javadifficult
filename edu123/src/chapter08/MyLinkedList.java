package chapter08;

public class MyLinkedList {

	private Node head;
	private class Node{
		private String data;
		private Node link;
		
		public Node(String data) {
			//해당 생성자는 필드가 2개 이므로 heap에 필드공간 2개를 할당한다.
			this.data=data; link=null;
		}
	}
	public void add(String data) {
		Node newNode= new Node(data);
		if(head==null)
			head= newNode;
		else {
			Node next=head;
			while(next.link!=null) {
				next=next.link;
			}
			next.link=newNode;
		}
	}
	public void print() {
		
	}
	public MyLinkedList(Node head) {
		this.head=head;
	}

}
