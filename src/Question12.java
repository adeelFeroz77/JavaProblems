import java.util.Arrays;
import java.util.HashMap;

public class Question12 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 4;
        Integer arr [] = {1,1,1,1};
        Integer k = 2;

        //SOLUTION
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            Integer prev = map.getOrDefault(arr[i],0);
            map.put(arr[i],prev+1);
        }
        Integer count = 0;
        for(int i=0;i<n;i++){
            if(k-arr[i]<=0){
                continue;
            }
            map.put(arr[i],map.get(arr[i])-1);
            count+= map.getOrDefault(k-arr[i],0);
        }
        System.out.println(count);
    }
}
