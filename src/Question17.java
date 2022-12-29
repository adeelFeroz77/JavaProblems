import java.util.Arrays;
import java.util.HashMap;

public class Question17 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 3;
        Integer arr [] = {1,1,1};

        //SOLUTION
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Integer val = map.getOrDefault(arr[i],-1);
            if(val!=-1){
                map.put(arr[i],(int)10e9);
            }else{
                map.put(arr[i],i);
            }
        }
        Integer index = n;
        for(Integer key: map.keySet()){
            index = Math.min(index,map.get(key));
        }
        if (index<n)
            System.out.println(arr[index]);
        else
            System.out.println("0");
    }
}
