import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {1,2,3,4,5};

        //SOLUTION
        Integer last = arr[0];
        for(int i=0;i<n;i++){
            Integer temp = arr[(i+1)%n];
            arr[(i+1)%n] = last;
            last = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
