public class rQuickSort {
    public static void sort(int[] arr){
        r_quick_sort(arr,0,arr.length-1);
    }
    public static void r_quick_sort(int []arr, int lo , int hi){
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);
        r_quick_sort(arr,lo,pivot-1);
        r_quick_sort(arr, pivot+1, hi);
    }
    public static int partition(int []arr, int left, int right){
        int lo = left;
        int hi = right;
        int pivot = arr[right];
        while(lo < hi){
            while(pivot > arr[lo] && lo < hi){
                lo++;
            }
            while(pivot <= arr[hi] && lo < hi){
                hi--;
            }
            
           
            swap(arr,lo,hi);
        }
        swap(arr,right,hi);
        return hi;
    }
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
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
