public class CountingSort {
    public static void main(String[] args) {
        int[] array= new int[100]; // 수열의 원소 : 100개
        int[] counting = new int[31]; // 수의 범위 : 0~30
        int[] result = new int[100]; //정렬된 배열 

        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*31);
        }
        //과정 1 
        for(int i=0;i<array.length;i++){
            counting[array[i]]++;
        }
        //과정 2
        for(int i=1;i<counting.length;i++){
            counting[i]+=counting[i-1];
        }

        //과정 3 
        for(int i= array.length-1; i>=0;i--){
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        System.out.println("array[]");
        for(int i=0;i<array.length;i++){
            if(i % 10 == 0) System.out.println();
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n\n");

        System.out.print("counting[]");
        for(int i=0;i<counting.length; i++){
            if(i% 10 == 0) System.out.println();
            System.out.print(counting[i]+"\t");
        }
        System.out.println("\n\n");
    }
}
