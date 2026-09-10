import java.util.Scanner;

public class helloo {

    public static void helloworld() {
        System.out.println("Hello World");
    }

    public static void calculatesum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        int a = sc.nextInt();

        System.out.println("Enter value:");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);

        sc.close();
    }

    public static void main(String[] args) {
        calculatesum();
        helloworld();
    }
}