public class numB {
    
    public static int fact(int i){
       
       if(i==0){
        return 1;
       }
       
        return  i* fact(i-1);
    }
    public static void main(String ar[]){  
       
      System.out.print(fact(5));
    }
}
