

public class HeapPrinter {

	public static void main(String[] args) {
		FibonacciHeap heap = new FibonacciHeap();
		printer(heap);
	}
	
	public static void printer(FibonacciHeap heap)
	{
		FibonacciHeap.HeapNode pointer;
		FibonacciHeap.HeapNode first =  heap.getFirst();
		pointer = first;
		int numberOfTrees = heap.getNumberOfTrees();
		String[] listOfstrs = new String[numberOfTrees];
		if (pointer == null) {
			System.out.println("The heap is empty");
			return;
		}
		int counter = 0;
		do {
			listOfstrs[counter++] = printer(pointer) ;
			pointer = pointer.getNext();
		} while (pointer != first);
	}

	private static String printer(FibonacciHeap.HeapNode pointer) {
		// TODO Auto-generated method stub
		return null;
	}

}
