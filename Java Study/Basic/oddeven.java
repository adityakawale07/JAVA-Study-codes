import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
