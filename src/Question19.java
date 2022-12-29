import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Question19 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 10;
        Integer arr [] = {-5,-2,5,2,4,7,1,8,0,-8};

        //SOLUTION
        Queue<Integer> positives = new LinkedList<>();
        Queue<Integer> negatives = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negatives.add(arr[i]);
            }else{
                positives.add(arr[i]);
            }
        }
        Integer x = positives.size(), y=negatives.size();
        Integer i =0,j=0;
        Integer current = 0;
        while (i<x && j<y){
            arr[current] = positives.remove();
            arr[current+1] = negatives.remove();
            current+=2;
            i++;j++;
        }
        while (i<x){
            arr[current] = positives.remove();
            i++;
            current++;
        }
        while (j<y){
            arr[current] = negatives.remove();
            j++;
            current++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
