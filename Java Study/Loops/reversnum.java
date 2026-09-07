public class reversnum {
    public static void main(String[] args) {
        int num=872652;
        while(num>0)
        {
            int LastDigit=num%10;
            System.out.print(LastDigit);
            num=num/10;
        }
    }
}
