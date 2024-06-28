package learn;

/*Binary Heap Operations
Difficulty: MediumAccuracy: 22.3%Submissions: 83K+Points: 4
A binary heap is a Binary Tree with the following properties:
1) Its a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array.

2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at the root must be minimum among all keys present in Binary Heap. The same property must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to MinHeap.

You are given an empty Binary Min Heap and some queries and your task is to implement the three methods insertKey,  deleteKey,  and extractMin on the Binary Min Heap and call them as per the query given below:
1) 1  x  (a query of this type means to insert an element in the min-heap with value x )
2) 2  x  (a query of this type means to remove an element at position x from the min-heap)
3) 3  (a query like this removes the min element from the min-heap and prints it ).

Example 1:

Input:
Q = 7
Queries:
insertKey(4)
insertKey(2)
extractMin()
insertKey(6)
deleteKey(0)
extractMin()
extractMin()
Output: 2 6 - 1
Explanation: In the first test case for
query 
insertKey(4) the heap will have  {4}  
insertKey(2) the heap will be {2 4}
extractMin() removes min element from 
             heap ie 2 and prints it
             now heap is {4} 
insertKey(6) inserts 6 to heap now heap
             is {4 6}
deleteKey(0) delete element at position 0
             of the heap,now heap is {6}
extractMin() remove min element from heap
             ie 6 and prints it  now the
             heap is empty
extractMin() since the heap is empty thus
             no min element exist so -1
             is printed.
Example 2:

Input:
Q = 5
Queries:
insertKey(8)
insertKey(9)
deleteKey(1)
extractMin()
extractMin()
Output: 8 -1
Your Task:
You are required to complete the 3 methods insertKey() which take one argument the value to be inserted, deleteKey() which takes one argument the position from where the element is to be deleted and extractMin() which returns the minimum element in the heap(-1 if the heap is empty)

Expected Time Complexity: O(Q*Log(size of Heap) ).
Expected Auxiliary Space: O(1).

Constraints:
1 <= Q <= 104
1 <= x <= 104*/

public class BinaryHeapOperation {

	public static void main(String[] args) {
		
		MinHeap heap=new MinHeap(10);
		heap.insertKey(4);
		
		heap.insertKey(2);
		heap.insertKey(3);
		heap.insertKey(7);
		heap.insertKey(10);
		print(heap.harr);
		
		System.out.println();
		print(heap.heap_size);
		
		heap.deleteKey(3);
		print(heap.harr);
		
		print(heap.heap_size);
	}
	
	public static void print(int[] heap) {
		for(int e: heap) {
			System.out.print(e+" ");
		}
	}
	
	public static void print(int s) {
		System.out.println(s);
	}
}
//} Driver Code Ends

//User function Template for Java

class MinHeap {
	int[] harr;
	int capacity;
	int heap_size;

	MinHeap(int cap) {
		heap_size = 0;
		capacity = cap;
		harr = new int[cap];
	}

	int parent(int i) {
		return (i - 1) / 2;
	}

	int left(int i) {
		return (2 * i + 1);
	}

	int right(int i) {
		return (2 * i + 2);
	}

	// Function to extract minimum value in heap and then to store
	// next minimum value at first index.
	int extractMin() {
// Check if heap is empty
		if (heap_size == 0) {
			return -1;
		}

// Store the minimum element (root)
		int min = harr[0];

// Move the last element to the root
		harr[0] = harr[heap_size - 1];
		heap_size--;

// Heapify down to maintain the min-heap property
		MinHeapify(0);

		return min;
	}

	// Function to insert a value in Heap.
	void insertKey(int k) {
		harr[heap_size] = k;
		heap_size++;
		int i = heap_size-1;

		while (i != 0 && harr[parent(i)] > harr[i]) {
			int temp = harr[parent(i)];
			harr[parent(i)] = harr[i];
			harr[i] = temp;

			i = parent(i);
		}
	}

	// Function to delete a key at ith index.
	void deleteKey(int i) {
// Check for valid index and underflow
		if (i >= heap_size) {
			return;
		} else if (heap_size == 1) {
			heap_size--;
			return;
		}

// If the key to be deleted is the last element, simply decrement size
		if (i == heap_size - 1) {
			heap_size--;
			return;
		}

// Swap the element at i with the last element
		harr[i] = harr[heap_size - 1];
		heap_size--;

// Heapify down (or up) to maintain the min-heap property
		MinHeapify(i);
	}

	// Function to change value at ith index and store that value at first index.
	void decreaseKey(int i, int new_val) {
		harr[i] = new_val;
		while (i != 0 && harr[parent(i)] > harr[i]) {
			int temp = harr[i];
			harr[i] = harr[parent(i)];
			harr[parent(i)] = temp;
			i = parent(i);
		}
	}

	/*
	 * You may call below MinHeapify function in above codes. Please do not delete
	 * this code if you are not writing your own MinHeapify
	 */
	void MinHeapify(int i) {
     int l = left(i);
     int r = right(i);
     int smallest = i;
     if (l < heap_size && harr[l] < harr[i]) smallest = l;
     if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
     if (smallest != i) {
         int temp = harr[i];
         harr[i] = harr[smallest];
         harr[smallest] = temp;
         MinHeapify(smallest);
     }
	}
 }
