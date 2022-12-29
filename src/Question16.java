import java.util.Arrays;
import java.util.HashMap;

public class Question16 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 4;
        Integer arr [] = {1,2,3,4};

        //SOLUTION
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer ans = (int)10e9;
        for(int i=0;i<n;i++){
            Integer val = map.getOrDefault(arr[i],-1);
            if (val!=-1){
                ans = Math.min(ans,val);
            }else{
                map.put(arr[i],i+1);
            }
        }
        if (ans==(int)10e9)
            System.out.println("-1");
        else
        System.out.println(ans);
    }
}
