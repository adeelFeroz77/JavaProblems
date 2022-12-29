public class Question24 {
    public static void main(String[] args) {
        // PROBLEM INPUT
//        Integer n= 6;
//        Integer arr [] = {3,0,0,2,0,4};
//        Integer n= 4;
//        Integer arr [] = {7,4,0,9};
        Integer n= 3;
        Integer arr [] = {6,9,9};

        //SOLUTION
        Integer left [] = new Integer[n];
        Integer right [] = new Integer[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(arr[i],left[i-1]);
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        Integer ans = 0;
        for(int i=0;i<n;i++){
            Integer mini = Math.min(left[i],right[i]);
            ans+= Math.max(mini-arr[i],0);
        }
        System.out.println(ans);
    }
}
