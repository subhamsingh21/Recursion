import java.util.*;
public class pow{
    public static int power(int num,int num2){
        if(num==0 && num2==0){
            System.out.print("not define");
             return -1;}
        if(num2==0) return 1;
        return num * power(num,num2 -1);
    }
    public static int logPower(int num,int num2){
        if(num==0 && num2==0){
            System.out.print("no");
          return -1;
        }
        
        if(num2==0)return 1;
        int ans= logPower(num,num2/2 );
        if(num2%2==0){
          return ans * ans; 
        }
        else{
            return ans*ans*num;
        }
       
    }
    public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter first number  ");
int num=sc.nextInt();
System.out.print("enter second number  ");
int num2=sc.nextInt();
       System.out.print(logPower (num,num2));
       
     
    }
}
