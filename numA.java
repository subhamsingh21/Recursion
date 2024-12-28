public class numA {
    public static void revNum(int i,int n){
        if(i > n){
            return;
        }
       revNum(i+1,n);
       System.out.print(i + " ");
    }
    public static void main(String ar[]){
      revNum(1,5);
    }
    
}
