public class Question2 {
    public static void main(String[] args) {
        // PROBLEM INPUT
        String s  = "for";

        //SOLUTION
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
    }
}
