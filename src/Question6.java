import java.lang.reflect.Array;
import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 3;
        Integer arr [] = {0,1,0};
        Integer X = 1;

        //SOLUTION
        // APPROACH: Since we know that we only have 3 values i.e (0,1,2), So we can
        //           maintain a count of them and insert them after first iteration
        Integer zero = 0, one = 0, two = 0;
        for(int i=0;i<n;i++){
            if(arr[i].equals(0)){
                zero++;
            } else if (arr[i].equals(1)) {
                one++;
            }else {
                two++;
            }
        }
        Integer index = 0;
        while (zero>0){
            arr[index] = 0;
            index++;
            zero--;
        }
        while (one>0){
            arr[index] = 1;
            index++;
            one--;
        }
        while (two>0){
            arr[index] = 2;
            index++;
            two--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
