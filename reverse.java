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
        System.out.print(one+" ");
        System.out.print(two+" ");
        for(int i=2;i<n;i++){
            int temp=one+two;
            
            System.out.print(temp+" ");
            one=two; 
            two=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(new reverse().reverse1(123));
        new reverse().fibo(10);
    }
}
// 123