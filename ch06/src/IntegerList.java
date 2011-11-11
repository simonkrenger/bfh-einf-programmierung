import java.util.Arrays;

public class IntegerList {
	final static int INITIAL_SIZE = 10;
	private int[] integers;
	private int size;

	public IntegerList() {
		integers = new int[INITIAL_SIZE];
		size = 0;
	}
	
	public String add(int x) {
		if (size == integers.length)
			integers = Arrays.copyOf(integers, 2 * integers.length);
		integers[size] = x;
		size++;
		return "Element added";
	}

	public String insert(int x, int position) {
		if (position < 0 || position > size)
			return "Invalid Position";
		if (size == integers.length)
			integers = Arrays.copyOf(integers, 2 * integers.length);
		for (int i = size; i > position; i--)
			integers[i] = integers[i - 1];
		integers[position] = x;
		size++;
		return "Element inserted";
	}
	
	public String remove(int position) {
		if (position < 0 || position > size-1)
			return "Invalid Position";
		for (int i = position; i < size-1; i++)
			integers[i] = integers[i + 1];
		size--;
		return "Element removed";
	}

	public void printList() {
		System.out.print("< ");
		for (int i = 0; i < size; i++)
			System.out.printf("%1d ",integers[i]);
		System.out.println(">");
	}

	public int size() {
		return size;
	}
}