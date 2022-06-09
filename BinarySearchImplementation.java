public class BinarySearchImplementation {
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 6, 9}; 
		int n = arr.length; 
		
	
		System.out.println(binarySearch(arr, 3, 0, arr.length-1)); 
	

	}
	// sample input: (arr, 3, 0, 4 )
	public static int binarySearch( int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;
		
		while (low <= high) {
			int mid = low  + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break; // get out of the loop
			}
		}
		// low: 0, high: 4
		// mid: 2
		// since 4 > 3
		// high: 1
		

		return index;

	}

}
