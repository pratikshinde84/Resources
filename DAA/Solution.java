import java.util.*;
class Solution {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                ar.add(0,-1);
            }else{
                while(!stk.isEmpty()&&stk.peek()<arr[i]){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ar.add(0,-1);
                }else{
                    ar.add(0,stk.peek());
                }
                stk.push(arr[i]);
            }
        }
        return ar;
    }    
    public static void main(String[] args) {   
        System.out.print(nextLargerElement(new int[]{6,8,0,1,3}));
    }
}