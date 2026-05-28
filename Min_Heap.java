public class Min_Heap {
    boolean isMinHeap(int arr[], int n) {
        for(int i=0;i<=n/2;i++){
            if(left(i)<n && arr[i]>arr[left(i)]){
                return false;
            }
            if(right(i)<n && arr[i]>arr[right(i)]){
                return false; 
            }
        }
        return true;  
    }
    int left(int ele){
        return 2*ele+1; 
    }
    int right(int ele){
        return 2*ele+2;
    }     
    public static void main(String[] args) {  
        Min_Heap mh=new Min_Heap(); 
        int arr[]={1,2,3}; 
        int n=arr.length;  
        System.out.println(mh.isMinHeap(arr, n));
    }
}
