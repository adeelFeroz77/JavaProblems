import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {4,2,-3,1,6};

        //SOLUTION
        boolean isPossible = false;
        for(int i=0;i<n;i++){
            Integer current = arr[i];
            if (current==0) {
                isPossible = true;
                break;
            }
            for(int j=i+1;j<n;j++){
                current+=arr[j];
                if (current==0){
                    isPossible = true;
                    break;
                }
            }
        }
        if (isPossible){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
