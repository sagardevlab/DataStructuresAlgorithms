package algorithms.sorting;

public class QuickSort {
    
    public void sort(int arr[], int low, int high){
        if(low<high){
            int pIndex = partition(arr, low, high);
            sort(arr, low, pIndex-1);
            sort(arr, pIndex+1, high);
        }
    }
    
    public int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int pIndex = low;
        for(int i=low;i<high;i++){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
    } 
}
