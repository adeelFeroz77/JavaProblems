import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public static List<Integer> compare(Integer [] arr1, Integer [] arr2){
        List<Integer> common = new ArrayList<>();
        Integer n = arr1.length, m = arr2.length;
        Integer i = 0, j=0;
        Integer last = (int) 10e9;
        while (i<n && j<m){
            if (arr1[i].equals(arr2[j])) {
                if (arr1[i]!=last) {
                    common.add(arr1[i]);
                    last = arr1[i];
                }
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return common;
    }

    public static void main(String[] args) {
        // PROBLEM INPUT
        Integer n1 = 6, n2=5, n3=8;
        Integer a [] = {1,5,10,20,40,80};
        Integer b [] = {6,7,20,80,100};
        Integer c [] = {3,4,15,20,30,70,80,120};

        //SOLUTION
        List<Integer> common = new ArrayList<>();
        common = compare(a,b);
        Integer temp [] = new Integer[common.size()];
        for (int i=0;i<temp.length;i++){
            temp[i] = common.get(i);
        }
//        System.out.println(Arrays.toString(temp));
        common = compare(temp,c);
        System.out.println(common);
    }
}
