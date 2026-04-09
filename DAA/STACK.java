package DAA;
class STACK{
    static int arr[]=new int[5];
    static int top=-1;
    static void push(int ele){
        if(top>=4){
            System.out.println("Stack overflow ....");
            return;
        }
        arr[++top]=ele;
    }
    static int pop(){
        if(top==-1){
            System.out.println("Stack underflow ....");
            return -1;
        }
        return arr[top--];
    }
    static void show(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        push(2);
        push(5);
        push(1);
        push(3);
        push(4);
        push(2);
        System.out.println(" askj"+top);
        show();
        pop();
        pop();
        show();
    }
}