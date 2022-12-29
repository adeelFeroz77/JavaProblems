import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {1,2,3,5};

        //SOLUTION
        Arrays.sort(arr);
        Integer missing = n;
        for(int i=0;i<n-1;i++){
            if (arr[i]!=i+1){
                missing = i+1;
                break;
            }
        }
        System.out.println(missing);
    }
}
