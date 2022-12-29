public class Question23 {
    public static void main(String[] args) {
        // PROBLEM INPUT
//        Integer N = 4, M= 4;
//        Integer Arr [][] = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        Integer N = 2, M= 2;
        Integer Arr [][] = {{0,0},{1,1}};

        //SOLUTION
        Integer maxIndex = -1;
        Integer maxValue = -1;
        for(int i=0;i<N;i++){
            Integer current = 0;
            for(int j=0;j<M;j++){
                current+= Arr[i][j];
            }
            if (current>maxValue){
                maxValue = current;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
