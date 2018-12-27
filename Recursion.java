public class Recursion{
   //part1: factorial non-recursion
   
   
   
   //part2: factorial recursion
   
   public class recursion{
        public static void rec(int n){
            
            if ( n==1 ){
                return;
            }
            rec(n-1);
            System.out.println(n);
        }
        public static int factorial(int n){
            if(n==1 || n==0 ){
                return 1;
            }
            return n* factorial(n-1);
        } 
        
        public static void main(String[] args){
            int n=3;
            System.out.println(factorial(n));
        }
}
   
   //part3: fibonacci sequence non-recursion
   
   
   
   //part4: fibonacci sequence recursion
public class tuzi{
    public class tuzi{
    public static void rec(int n){
        
        if ( n==1 ){
            return;
        }
        rec(n-1);
        System.out.println(n);
    }
    public static int fibo(int n){
        if(n==1 || n==0 ){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    } 
    
    public static void main(String[] args){
        
        System.out.println(fibo(20)/(double) fibo(21));
    }
}
