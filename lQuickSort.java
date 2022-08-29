public class lQuickSort {
    public static void sort(int []arr){
        l_quick_sort(arr,0,arr.length-1);
    }
    public static void l_quick_sort(int []arr, int lo,int hi){
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);
        l_quick_sort(arr, lo, pivot-1);
        l_quick_sort(arr, pivot+1, hi);

    }
    public static int partition(int []arr,int lo, int hi){
        int left = lo;
        int pivot = arr[left];
        while(lo<hi){
            while(pivot < arr[hi] && lo < hi){
                hi--;
            }
            while(pivot >= arr[lo] && lo < hi){
               lo++; 
            }
            swap(arr,lo,hi);
        }
        swap(arr,left,hi);
        return lo;
    }
    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int []arr = {1,5,2,7,4,3,9};
        sort(arr);
        for(int x : arr){
            System.out.println(x);
        }
    }
}
