import java.util.Scanner;
class Fibonnachiseries
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the term no in fib series");
        int n=input.nextInt();
        int s=fib(n);
        System.out.println(s);
            
        
    }
    static int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}