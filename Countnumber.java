import java.util.Scanner;
class Countnumber
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        System.out.println(countnum(n));
    }
    static int countnum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return 1+countnum(n-1);
    }
}