public class sumfunctionoverloading {
    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2 nums:");
        System.out.println(sum(5, 3));
        System.out.println("The sum of 3 nums:");
        System.out.println(sum(05,2,1));
    }
}
