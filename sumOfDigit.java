public class sumOfDigit {
    public static int digit(int n){
        if(n==0){
            return 0;
        }
         return n%10 + digit(n/10);
    }
    public static void main(String[] args) {
        int ans=digit(1234);
        System.out.print(ans);
    }
    
}
