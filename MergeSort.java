public class MergeSort {
    static int sorted[];
    static void merge_sort(int []a){
        sorted = new int[a.length];
        merge_sort(a, 0, a.length-1);
        sorted = null;
    }
    static void merge_sort(int []a, int left, int right){
       
        for(int size = 1;size <= right; size+=size){
            /*
            *  두 부분리스트를 순서대로 병합해준다.
            * 예로들어 현재 부분리스트의 크기가 1(size=1)일 때, 
            * 왼쪽 부분리스트(low~mid)와 오른쪽 부분리스트(mid + 1 ~ high)을 생각하면 
            * 왼쪽 부분리스트는 low = mid = 0 이고, 
            * 오른쪽 부분리스트는 mid + 1 부터 low + (2 * size ) - 1 = 1이 된다.
            * 이 때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이 되도록 병합  
            */
            for(int l=0; l <= right - size; l += (2 * size)){
                int low = l;
                int mid = 1 + size - 1;
                int hight = Math.min(l + (2 * size ) -1, right);
                merge(a,low,mid,hight);
            }
        }
    }
    static void merge(int []a, int left, int mid, int right){
        int l = left;
        int r = mid + 1;
        int idx = left;
        while(l <= mid && r<=right){
            if(a[l]<=a[r]){
                sorted[idx]=a[l];
                idx++;
                l++;
            }else{
                sorted[idx]=a[r];
                idx++;
                r++;
            }
        }
        if(l>mid){
            while(r<=right){
                a[idx]=a[r];
                r++;
                idx++;
            }
        }
        if(r>right){
            while(l<=mid){
                a[idx]=a[l];
                l++;
                idx++;
            }
        }

        for(int i=left; i<=right;i++){
            a[i]=sorted[i];
        }
    }
}
