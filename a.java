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
    public static void main(String[] args) {
        System.out.println(new a().makeGood("leEeetcode"));
    }
}