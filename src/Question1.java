public class Question1 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n = 5;
        Integer arr [] = {1,345,234,21,56789};

        //SOLUTION
        Integer mini = arr[0],maxi = arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]<mini){
                mini = arr[i];
            }
            if (arr[i]>maxi){
                maxi = arr[i];
            }
        }
        System.out.println("Min: " + mini + " Max: " + maxi);
    }
}
