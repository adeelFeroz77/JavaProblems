import java.lang.reflect.Array;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {7,10,4,20,15};
        Integer k = 4;

        //SOLUTION
        // SORT THE ARRAY, RETURN Kth element from the beginning
        for (int i=1;i<n;i++){
            Integer current = arr[i];
            int j=i-1;
            for(;j>=0 && arr[j]>current;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
        System.out.println(arr[k-1]);
    }
}
