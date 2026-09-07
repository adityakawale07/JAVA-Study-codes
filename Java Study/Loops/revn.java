public class revn {
    public static void main(String args[]){
        int num=83927;
        int rev=0;
        while(num>0){
            int no=num%10;
            rev=(rev*10)+no;
            num=num/10;
        }
        System.out.println(rev);
    }
}
