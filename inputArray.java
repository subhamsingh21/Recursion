import java.util.*;
public class inputArray{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        // size of array
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        // always give input with spaces
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // print an array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}