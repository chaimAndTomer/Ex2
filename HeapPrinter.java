

public class HeapPrinter {

	public static void main(String[] args) {
		FibonacciHeap heap = new FibonacciHeap();
		printer(heap);
	}
	
	public static void printer(FibonacciHeap heap)
	{
		FibonacciHeap.HeapNode pointer, first;
		first = ((FibonacciHeap) heap).getFirst();
		pointer = first;
		int numberOfTrees = heap.getNumberOfTrees();
		String[] listOfstrs = new String[numberOfTrees];
		while (pointer != first) {
			
		}
	}

}
