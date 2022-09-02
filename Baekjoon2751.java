import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon2751 {
    
    static int[] sorted;
    static void sort(int []arr){
        sorted = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
    }
    static void mergeSort(int []arr ,int left, int right){
        int mid = (left + right) /2;
        if(left==right) return;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr,int left, int mid ,int right){
        int l = left;
        int r = mid+1;
        int idx = left;
        while(r<=right && l <= mid){
            if(arr[l] <= arr[r]) {
                sorted[idx]=arr[l];
                l++;
                idx++;
            }else{
                sorted[idx]=arr[r];
                r++;
                idx++;
            }
        }
        if(l>mid){
            while(r<=right){
                sorted[idx]=arr[r];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sorted[idx]=arr[l];
                l++;
                idx++;
            }
        }
        for(int i=left;i<=right;i++){
            arr[i]=sorted[i];
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        sort(arr);
        for(int x : sorted) System.out.println(x);
    }
}
