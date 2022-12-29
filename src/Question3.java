import java.lang.reflect.Array;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 2;
        Integer arr [] = {3,1};

        //SOLUTION
        for (int i=1;i<n;i++){
            Integer current = arr[i];
            int j=i-1;
            for(;j>=0 && arr[j]>current;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
