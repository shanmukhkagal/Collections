public class LinkedListImplementation {
Node head;
    
	//UC 1&3
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null ) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			
		}
	}
	//UC 2&4
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		for(int i = 0; i < index-1; i++ ) {
	       n = n.next; 		
		}
		node.next  = n.next;
		n.next = node;
	}
	
	//UC 5
	public void deleteAtFirst(int index) {
		if (index == 0) {
			head = head.next;
		}
	}
	//UC6
	public void deleteAt(int index) {
		
		Node node = head;
		Node n1 = null;
		for(int i = 0; i < index-1; i++ ) {
			node = node.next;
		}
		n1 = node.next;
		node.next = n1.next;
		
	}
	
	public void show() {
		Node node = head;
		while(node.next != null) {
	       System.out.println(node.data);		
			node = node.next;
		}
		System.out.println(node.data);
	}
}


