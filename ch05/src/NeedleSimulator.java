public class NeedleSimulator
{
	public static void main(String[] args)
	{
		Needle n = new Needle();
		final int TRIES1 = 10000;
		final int TRIES2 = 1000000;
		final int TRIES3 = 10000000;
		final int TRIES4 = 100000000;

		for (int i = 1; i <= TRIES1; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n", TRIES1, (double) n.getTries() / n.getHits());

		for (int i = TRIES1 + 1; i <= TRIES2; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n", TRIES2, (double) n.getTries() / n.getHits());

		for (int i = TRIES2 + 1; i <= TRIES3; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n", TRIES3, (double) n.getTries() / n.getHits());

		for (int i = TRIES3 + 1; i <= TRIES4; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n", TRIES4, (double) n.getTries() / n.getHits());
	}
}