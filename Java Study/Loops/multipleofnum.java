import java.util.Scanner;

public class multipleofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
        System.out.println("Successfully entered multiple of 10");
        sc.close();
    }
}
