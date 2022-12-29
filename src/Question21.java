import java.util.Arrays;

public class Question21 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 10;

        //SOLUTION
        Integer [] arr = new Integer[n+1];
        arr[0] = 1;
        for(int i=1;i<n+1;i++){
            arr[i] = i*arr[i-1];
        }
        System.out.println(arr[n]);

    }
}
