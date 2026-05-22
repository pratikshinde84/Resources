import java.util.*;

public class Main {

    // Function to get grade based on marks
    public static void getGrade(int arr[],int count[]) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>=90&&arr[i]<=100){
                count[0]++;
            }else if(arr[i]>=80&&arr[i]<90){
                count[1]++;
            }else if(arr[i]>=70&&arr[i]<80){
                count[2]++;
            }else if(arr[i]>=60&&arr[i]<70){
                count[3]++;
            }else if(arr[i]>=50&&arr[i]<60){
                count[4]++;
            }else if(arr[i]>=0&&arr[i]<50){
                count[5]++;
            }else{
                count[6]++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[7];
        int arr[]=new int[n];

        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'X'};

        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        getGrade(arr,count);

        int ans=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>count[ans]){
                ans=i;
            }
        }
        System.out.println(grades[ans]);

        sc.close();
    }
}
