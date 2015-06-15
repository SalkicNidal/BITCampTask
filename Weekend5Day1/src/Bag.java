public class Bag {
	//
	public Integer maxcapacity;
	public Integer capacity;

	// Constructor for bag
	public Bag(Integer maxcapacity) {
		super();

		this.maxcapacity = maxcapacity;
		capacity = 0;
	}

	public Integer getMaxCapacity() {
		return maxcapacity;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer emptyPleace() {

		return maxcapacity - capacity;
	}

	public Integer add(Integer items) {
		if (capacity + items <= maxcapacity) {
			capacity += items;
		}
		return capacity;

	}

	public void remove(Integer items) {

		if (capacity - items >= 0)
			capacity -= items;

	}
}
