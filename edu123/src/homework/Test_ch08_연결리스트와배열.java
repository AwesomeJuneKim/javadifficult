package homework;

class Node3 {
	int data;
	Node3 link;

	public Node3(int data) {
		this.data = data;
		link = null;
	}
}

class LinkedList3 {
	Node3 first;// node를 저장하는 first필드가 하나 생성됨

	void append(int data) {
		Node3 p = first, q = null;// q는 p를 대입할 빈 공간
		Node3 newNode = new Node3(data);
		if (p == null) {
			first = newNode;
			return;
		} else {
			while (p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}
		// first는 null이었으므로
	}

	public LinkedList3() {
		first = null;
	}

	void showList() {
		System.out.println("LinkedList: ");
		Node3 p = first;

	}

	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;
		while (p != null && p.data < data) {
			p=q;
			p=p.link;//연결할 위치 찾기
		}
		if(q==null) {//첫번째에 삽입해야하는 경우
			newNode.link=first;
			first=newNode;
		}else {//중간에 삽입해야하는 경우
			newNode.link=p;
			q.link=newNode;
		}
		
	}

public class Test_ch08_연결리스트와배열 {
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;
		}
		return count;
	}
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
	}
	static int insertList(int[] data, int count, int x) {
		int indx = 0;
		int i=0;
		while(indx<count) {
			if(x<data[indx]) {//자리찾기
				while(indx<count) {
					int tmp= data[i];
					data[i]=x;
					x=data[++i];
				}
				break;
			}
			else
				indx++;
		}
		return count+1;
	}
public static void main(String[] args) {
	int[]list = new int[10];
	int count = 0;
	System.out.println("배열로 리스트::");
	count = getList(list);
	showList(list);
	count = insertList(list, count, 3);
	showList(list);
	count = insertList(list, count, 7);
	showList(list);
	
	LinkedList3 ll = new LinkedList3();
	ll.append(5);ll.append(10);ll.append(15);ll.append(20);ll.append(25);
	ll.showList();
	ll.insert(3);ll.showList();
	ll.insert(7);ll.showList();
}
}
