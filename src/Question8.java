import javax.swing.*;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 8;
        Integer arr [] = {1, -1, 3, 2, -7, -5, 11, 6 };

        //SOLUTION
        Queue<Integer> negIndexes = new LinkedList<>();
        Queue<Integer> negatives = new LinkedList<>();
        Integer posCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negatives.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if (arr[i]<0){
                negIndexes.add(i);
            }else{
                posCount++;
                Integer loc = -1;
                if (negIndexes.size()>0){
                    loc = negIndexes.remove();
                }
                if (loc!=-1){
                    Integer temp = arr[i];
                    arr[i] = arr[loc];
                    arr[loc] = temp;
                    i--;
                }
            }
        }
        for(int i=posCount;i<n;i++){
            arr[i] = negatives.remove();
        }
        System.out.println(Arrays.toString(arr));
    }
}
