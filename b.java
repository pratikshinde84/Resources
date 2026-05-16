import java.util.HashSet;

class b{
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashSet<Integer> set;
        int ans=0;
        for(int i=0;i<n;i++){
            int j=i;
            set=new HashSet<>();
            int count=0;
            while(i<n&&set.size()<3){

                set.add(fruits[i]);
                if(set.size()<=2){
                    count++;
                }
                i++;
            }
            i=j;
            ans=Math.max(ans,count);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new b().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}