import java.util.Arrays;
import java.util.Stack;

public class Question22 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 6;
        Integer arr [] = {10,4,5,90,120,80};

        //SOLUTION
        Stack<Integer> indexes = new Stack<>();
        Integer ans [] = new Integer[n];
        ans[0] = 1;
        indexes.add(0);
        for(int i=1;i<n;i++){
            Integer val = 1;
            while (indexes.size()>0){
                Integer idx = indexes.pop();
                if (arr[i]>=arr[idx]){
                    val += ans[idx];
                }else{
                    indexes.push(idx);
                    break;
                }
            }
            indexes.push(i);
            ans[i] = val;
        }
        System.out.println(Arrays.toString(ans));
    }
}
