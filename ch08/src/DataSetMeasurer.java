public class DataSetMeasurer {
	private int count;
	private Object maximum;
	private Measurer measurer;

	public DataSetMeasurer(Measurer m) {
		count = 0;
		maximum = null;
		measurer = m;
	}

	public void add(Object x) {
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
			maximum = x;
		count++;
	}

	public Object getMaximum() {
		return maximum;
	}
}