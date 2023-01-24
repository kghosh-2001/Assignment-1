import java.util.Scanner;
class Powerof2
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        int a=countpow(n);
        System.out.println(a);
    }
    static int countpow(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return 2*countpow(n-1);
        
    }
}