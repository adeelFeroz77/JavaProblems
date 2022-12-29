import java.util.Arrays;
import java.util.HashMap;

public class Question18 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {1,1,1,1,0};

        //SOLUTION
        Integer current = 0;
        Integer ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(current,1);
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                current+=1;
            }else{
                current-=1;
            }
            ans+=map.getOrDefault(current,0);
            map.put(current,map.getOrDefault(current,0)+1);
        }
        System.out.println(ans);
    }
}
