class mQuickSort{
    public static void sort(int[] arr){
        l_quick_sort(arr,0,arr.length-1);
    }
    public static void l_quick_sort(int []arr, int lo , int hi){
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);

    }
    public static int partition(int []arr, int left, int right){
        int lo = left;
        int hi = right;
        int pivot = arr[left];
        while(lo < hi){
            while(pivot < arr[hi] && lo < hi){
                hi--;
            }
            while(pivot > arr[lo] && lo < hi){
                lo--;
            }
            swap(arr,lo,hi);
        }
        swap(arr,left,lo);
        return lo;
    }
    public static void swap(int []arr, int lo, int hi){
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }
    public static void main(String[] args) {
        int []arr = {1,5,2,7,4,3,9};
        
    }
}