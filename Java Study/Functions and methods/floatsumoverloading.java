public class floatsumoverloading {
     public static int sum(int a,int b)
    {
        return a+b;
    }

    public static float sum(float a,float b,float c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2 nums:");
        System.out.println(sum(5, 3));
        System.out.println("The sum of 3 nums:");
        System.out.println(sum(5.2f,2.4f,1.8f));
    }   
}
