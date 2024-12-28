public class printnum{
    public static void nums(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        nums(n+1);
    }
    public static void main(String[] args) {
        int n=1;
          nums(1);

    }

}