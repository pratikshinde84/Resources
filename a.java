class a{
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1){
            if(Math.abs(sb.charAt(i)-sb.charAt(i+1))==32){
                sb.delete(i,i+2);
                i=Math.max(0,i-1);
            }else{
                i++;
            }
        }
        return sb.toString();
    }
 
    public int longestOnes(int[] nums, int k) {
        int ans=0,ones=0;
        int left=0,right=0;
        int n = nums.length;
        for(right=0;right<n;right++){
            if(nums[right]==1){
                ones++;
            } 
            while(right-left+1-ones>k){
                if(nums[left]==1){
                    ones--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new a().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}      