import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=sc.nextInt();

        if(year % 100 ==0 ||(year %4==0 && year % 400 == 0))
        {
            System.out.println("Its Loop year");
        }
        else
        {
            System.out.println("Its not Leap year");
        }
        sc.close();
    }
}
