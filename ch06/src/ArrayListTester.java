import java.util.ArrayList;

public class ArrayListTester {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Bob");
		names.add("Caroline");
		names.add("Daniel");
		names.add("Eve");
		System.out.println(names.toString());
		names.add(0, "Finn");
		names.add(2, "Gerd");
		names.add(7, "Hector");
		System.out.println(names.toString());
		names.remove(7);
		names.remove(2);
		names.remove(0);
		names.set(4,"Ivan");
		System.out.println(names.toString());
		System.out.println(names.size());
		System.out.println(names.get(0));
		names.clear();
		System.out.println(names.toString());
	}
}