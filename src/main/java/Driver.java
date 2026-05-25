public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		Counter badCounter = null;
        if (counter.getCount() > 0) {
            System.out.println("Bad Counter: " + badCounter.getCount());
        }

		int[] dummyArray = {1, 2, 3};
        System.out.println("Akses indeks ilegal: " + dummyArray[5]);
	}

}
