import java.util.Scanner;
public class factorial {
   
    public static int Factorial(int num)
    {
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Factorials:");
        int num=sc.nextInt();
        System.out.println("The Factorial of number is:"+Factorial(num));
    }
}

