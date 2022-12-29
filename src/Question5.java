public class Question5 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {1,1,1,1,1};
        Integer X = 1;

        //SOLUTION
        Integer count = 0;
        for(int i=0;i<n;i++){
            if(arr[i].equals(X)){
                count++;
            }
        }
        System.out.println("Frequency of "+X+" is "+count);
    }
}
