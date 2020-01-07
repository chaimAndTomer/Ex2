/**
 * FibonacciHeap
 *
 * An implementation of fibonacci heap over integers.
 */

public class FibonacciHeap {
	private int n;
	private HeapNode min, first;
	
	/**
	 * public boolean isEmpty()
	 *
	 * precondition: none
	 * 
	 * The method returns true if and only if the heap is empty.
	 * 
	 */
	public boolean isEmpty() {
		return this.first == null;
	}

	/**
	 * public HeapNode insert(int key)
	 *
	 * Creates a node (of type HeapNode) which contains the given key, and inserts
	 * it into the heap.
	 */
	public HeapNode insert(int key) {
		HeapNode toInsert = new HeapNode(key);
		toInsert.setNext(first);
		if (first != null) {
			toInsert.setPrev(first.getPrev());
			first.setPrev(toInsert);
		}
		first = toInsert;
		return toInsert;
	}

	/**
	 * public void deleteMin()
	 *
	 * Delete the node containing the minimum key.
	 *
	 */
	public void deleteMin() {
		
		return; // should be replaced by student code

	}

	/**
	 * public HeapNode findMin()
	 *
	 * Return the node of the heap whose key is minimal.
	 *
	 */
	public HeapNode findMin() {
		return new HeapNode(0);// should be replaced by student code
	}

	/**
	 * public void meld (FibonacciHeap heap2)
	 *
	 * Meld the heap with heap2
	 *
	 */
	public void meld(FibonacciHeap heap2) {
		return; // should be replaced by student code
	}

	/**
	 * public int size()
	 *
	 * Return the number of elements in the heap
	 * 
	 */
	public int size() {
		return 0; // should be replaced by student code
	}

	/**
	 * public int[] countersRep()
	 *
	 * Return a counters array, where the value of the i-th entry is the number of
	 * trees of order i in the heap.
	 * 
	 */
	public int[] countersRep() {
		int[] arr = new int[42];
		return arr; // to be replaced by student code
	}

	/**
	 * public void delete(HeapNode x)
	 *
	 * Deletes the node x from the heap.
	 *
	 */
	public void delete(HeapNode x) {
		return; // should be replaced by student code
	}

	/**
	 * public void decreaseKey(HeapNode x, int delta)
	 *
	 * The function decreases the key of the node x by delta. The structure of the
	 * heap should be updated to reflect this chage (for example, the cascading cuts
	 * procedure should be applied if needed).
	 */
	public void decreaseKey(HeapNode x, int delta) {
		return; // should be replaced by student code
	}

	/**
	 * public int potential()
	 *
	 * This function returns the current potential of the heap, which is: Potential
	 * = #trees + 2*#marked The potential equals to the number of trees in the heap
	 * plus twice the number of marked nodes in the heap.
	 */
	public int potential() {
		return 0; // should be replaced by student code
	}

	/**
	 * public static int totalLinks()
	 *
	 * This static function returns the total number of link operations made during
	 * the run-time of the program. A link operation is the operation which gets as
	 * input two trees of the same rank, and generates a tree of rank bigger by one,
	 * by hanging the tree which has larger value in its root on the tree which has
	 * smaller value in its root.
	 */
	public static int totalLinks() {
		return 0; // should be replaced by student code
	}

	/**
	 * public static int totalCuts()
	 *
	 * This static function returns the total number of cut operations made during
	 * the run-time of the program. A cut operation is the operation which
	 * diconnects a subtree from its parent (during decreaseKey/delete methods).
	 */
	public static int totalCuts() {
		return 0; // should be replaced by student code
	}

	/**
	 * public static int[] kMin(FibonacciHeap H, int k)
	 *
	 * This static function returns the k minimal elements in a binomial tree H. The
	 * function should run in O(k(logk + deg(H)).
	 */
	public static int[] kMin(FibonacciHeap H, int k) {
		int[] arr = new int[42];
		return arr; // should be replaced by student code
	}

	/**
	 * public class HeapNode
	 * 
	 * If you wish to implement classes other than FibonacciHeap (for example
	 * HeapNode), do it in this file, not in another file
	 * 
	 */
	public class HeapNode {

		public int key;
		private int rank;
		private boolean mark;
		public HeapNode child, next, prev, parent;
		public HeapNode getChild() {
			return child;
		}

		public HeapNode(int key, HeapNode child, HeapNode parent) {
			super();
			this.key = key;
			this.child = child;
			this.parent = parent;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public boolean isMark() {
			return mark;
		}

		public void setMark(boolean mark) {
			this.mark = mark;
		}

		public HeapNode getNext() {
			return next;
		}

		public void setNext(HeapNode next) {
			this.next = next;
		}

		public HeapNode getPrev() {
			return prev;
		}

		public void setPrev(HeapNode prev) {
			this.prev = prev;
		}

		public void setChild(HeapNode child) {
			this.child = child;
		}

		public HeapNode getParent() {
			return parent;
		}

		public void setParent(HeapNode parent) {
			this.parent = parent;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public HeapNode(int key) {
			this.key = key;
		}

		public int getKey() {
			return this.key;
		}
	}
}
