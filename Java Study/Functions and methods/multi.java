import java.util.Scanner;
public class multi 
{
    


    public static int Multiply(int num1,int num2)
    {
        int Product=num1*num2;
        System.out.println("The sum of two numbers is:"+Product);

        return Product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        Multiply(num1,num2);
    }
}
