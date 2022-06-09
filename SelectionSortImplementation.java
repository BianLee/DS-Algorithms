public class SelectionSortImplementation {
    public static void main(String[] args) {
        SelectionSortImplementation obj = new SelectionSortImplementation();
        int[] arr = {64,25,12,22,11};
        obj.selectionSort(arr); 
    }
    public void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {      
                    minIndex = j; 
                }
            }
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i];
            arr[i] = temp; 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
}