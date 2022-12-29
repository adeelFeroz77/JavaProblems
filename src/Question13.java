import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {2,3,1,3,2};

        //SOLUTION
        List<Integer> ans = new ArrayList<>();
        // We want answer in Sorted Array, So the KEYS of Treemap are always Sorted;
        Map<Integer,Integer> map = new TreeMap();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Integer i: map.keySet()){
            if (map.get(i)>1){
                ans.add(i);
            }
        }
        if (ans.size()==0){
            ans.add(-1);
        }
        System.out.println(ans);

    }
}
