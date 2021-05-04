public class Main {
	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();
		list.insert(56);
		list.insert(70);
		
		list.insertAt(1,30);
		
		list.deleteAtFirst(0);
		
		//list.deleteAt(2);
		
		list.show();

    }
}
