public class fact {
    public static int factorial(int n){
      
        if(n<=1){
            return 1;
        }
         return n*factorial(n-1);
       
         
    }
    public static void main(String[] args) {
    
        int ans= factorial(5);
         
         System.out.print(ans);
       
    }
}
