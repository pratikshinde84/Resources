class a{
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1){
            if(sb.charAt(i)>96&&sb.charAt(i)<123){
                if(sb.charAt(i+1)==sb.charAt(i)+32){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    if(sb.isEmpty()){
                        return "";
                    }
                    i=0;
                }
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new a().makeGood("leEeetcode"));
    }
}