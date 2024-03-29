public class Merge {
    private static int[] sorted; //합치는 과정에서 정렬하여 원소를 담을 임시 배열 

    /**
     * 부분리스트는 a배열의 left~right까지이다. 
     * @param a 정렬할 배열
     * @param left  배열의 시작점
     * @param mid   배열의 중간점
     * @param right 배열의 끝 점
     */
    public static void merge_sort(int[] a){
        sorted = new int[a.length];
        merge_sort(a,0,a.length-1);
        sorted = null;
    }

    // Top-Down 방식 구현 
    private static void merge_sort(int[] a, int left, int right){
        /*
            left==right 즉, 부분리스트가 1개의 원소만 갖고 있는 경우 
            더이상 쪼갤 수 없으므로 return 한다.
        */
        if(left == right) return;
        int mid = (left + right) / 2; //절반 위치
         merge_sort(a, left, mid);
         merge_sort(a,mid+1,right);
         merge(a,left,mid,right);
    }
    private static void merge(int[] a, int left, int mid, int right){
        int l = left;   // 왼쪽 부분리스트 시작점
        int r = mid + 1;    // 오른쪽 부분리스트의 시작점
        int idx = left; //채워 넣을 배열의 인덱스 

        while(l <= mid && r <= right){
            /*
                왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
                왼쪽의 l번째 원소를 새 배열에 넣고 l과 원소를 새 배열에 넣고 l과 idx를 1증가 시킨다.
            */
            if(a[l] <= a[r]){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
            else{
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        /**
         * 왼쪽 리스트가 먼저 새 배열에 채워졌을 경우 (l>mid)
         * 오른쪽 부분리스트 원소가 아직 남아있을 경우
         * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다. 
         */
        if(l>mid){
            while(r<=right){
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        /**
         * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우(r> right)
         *  왼쪽 부분리스트 원소가 남아있을 경우
         * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다. 
         */
        else{
            while(l<= mid){
                sorted[idx] = a[l];
                idx++;
                l++;
            }   
        }
        /*
        정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
        */
        for(int i=left;i<=right;i++){
            a[i] = sorted[i];
        }
    }
    public static void main(String[] args) {
        int []a = {1,2,5,7,8,3,4,9,6};
        merge_sort(a);
        for(int x :a)   System.out.println(x);
    }
}
