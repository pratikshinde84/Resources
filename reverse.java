public class reverse {
    int reverse1(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
    void fibo(int n){
        int one=0,two=1;
        System.out.println(one);
        System.out.println(two);
        for(int i=2;i<=n;i++){
            System.out.println(one+two);
            int temp=one+two;
            two=one;
            one=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(new reverse().reverse1(123));

        new reverse().fibo(10);
    }
}
// 123