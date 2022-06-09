public class QuickSortImplementation {
    public static void main(String[] args){ 
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        // low: 0, high: 6
        QuickSortImplementation obj = new QuickSortImplementation(); 
        obj.quickSort(arr, 0, arr.length -1); // arr, firstIndex, lastIndex
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        
    }
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); 
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 70
        int i = (low - 1); // -1 
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); 
            }
        }
        swap(arr, i+1, high);
        return i + 1; 

    }
    public void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}