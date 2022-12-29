import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {4,1,3,9,7};

        //SOLUTION
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    public  static int partition(Integer [] arr,int left, int right){
        int pivot = arr[right];
        int i= left-1;
        for(int j=0;j<right;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    public static void sort(Integer [] arr, int left, int right){
        if(left<right){
            int pivot = partition(arr,left,right);
            sort(arr,left,pivot-1);
            sort(arr,pivot+1,right);
        }
    }
}
