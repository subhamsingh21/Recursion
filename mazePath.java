public class mazePath {
    public static int maze(int m,int n ){
        if(m==1 || n==1) return 1;
        int rightway= maze(m,n-1);
        int downway=maze(m-1,n);
        return rightway + downway;
    }
    public static void main(String ar[]){
     System.out.print(maze(4,4));
    }
    
}
