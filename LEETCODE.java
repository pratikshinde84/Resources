class LEETCODE{
    public int longestKSubstr(String s, int k) {
        int max=0;
        int count=0;
        int left=0,right=0;
        int freq[]=new int[26];
        for(right=0;right<s.length();right++){
            if(freq[s.charAt(right)-'a']==0){
                count++;
            }
            freq[s.charAt(right)-'a']++;
            while(count>k){
                freq[s.charAt(left)-'a']--;
                if(freq[s.charAt(left)-'a']==0){
                    count--;
                }
                left++;
            } 
            max=Math.max(max,right-left+1);
        }
        return max;
    } 
    public static void main(String[] args) {
        LEETCODE lc=new LEETCODE();
        String s="aabacbebebe";
        int k=3;
        System.out.println(lc.longestKSubstr(s, k));
    }
}