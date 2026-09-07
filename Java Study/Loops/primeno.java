import java.util.*;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        boolean isPrime=true;

        if(n==2)
        {
            System.out.println("Prime no");
        }
        else
        {
            for(int i=2;i<n-1;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime==true)
        {
            System.out.println("Its Prime no");
        }
        else{
            System.out.println("Its not prime no7");
        }
    }
}