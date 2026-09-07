import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int tax;

        if(number<50000)
        {
            System.out.println("No Tax");
            tax=0;
        }
        else if(number>500000 && number<=1000000)
        {
            System.out.println("The Tax is 20%");
            tax=(int)(number* 0.2);
        }
        else
        {
            System.out.println("The Tax is 30%");
            tax=(int)(number*0.3);
        }
        System.out.println("The Tax is:"+tax);
        sc.close();
    }
}
