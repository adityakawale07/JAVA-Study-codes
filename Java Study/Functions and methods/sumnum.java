import java.util.Scanner;

public class sumnum {

    public static void SUM(int num1,int num2)
    {
        int summ=num1+num2;
        System.out.println("The sum of two numbers is:"+summ);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        SUM(num1,num2);
    }
}
