public class IntegerListTester {
	public static void main(String[] args) {
		IntegerList list = new IntegerList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.printList();
		list.insert(7, 0);
		list.insert(8, 2);
		list.insert(9, 7);
		list.printList();
		list.remove(7);
		list.remove(2);
		list.remove(0);
		list.printList();
		System.out.println(list.insert(0,10));
		System.out.println(list.remove(10));
	}
}