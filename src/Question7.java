public class Question7 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 10;
        Integer arr [] = {1,2,3,4,5,6,7,8,9,10};
        Integer S= 10;
    
        //SOLUTION
        Boolean isDone = false;
        Integer ans = -1;
        for(int i=0;i<n;i++){
            Integer currentSum = arr[i];
            if (arr[i].equals(S)){
                System.out.println((i+1) + " " + (i+1));
                break;
            }
            for(int j=i+1;j<n;j++){
                currentSum+=arr[j];
                if(currentSum>S){
                    break;
                }
                if(currentSum.equals(S)) {
                    isDone = true;
                    ans = j + 1;
                    break;
                }
            }
            if(isDone){
                System.out.println((i+1) + " " + ans);
                break;
            }
        }
        if(!isDone){
            System.out.println("-1");
        }
    }
}
