import java.util.HashSet;
import java.util.Set;

public class Question9 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 6, m = 2;
        Integer first [] = {85,25,1,32,54,6};
        Integer second [] = {85,2};

        //SOLUTION
        Set<Integer> union = new HashSet<>();
        for(int i=0;i<n;i++){
            union.add(first[i]);
        }
        for(int i=0;i<m;i++){
            union.add(second[i]);
        }
        System.out.println(union.size());
    }
}
