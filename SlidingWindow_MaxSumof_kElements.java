import java.util.Scanner;

public class SlidingWindow_MaxSumof_kElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        System.out.println("give the elements of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the number of consecutive element");
        int k=sc.nextInt();

        // sum of first k elements
        int sum=0;
         for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int MaxSum=sum;

        // slide the window --->
        for(int i=k;i<length;i++){
            sum+=arr[i]-arr[i-k];  //add new remove old

            MaxSum=Math.max(MaxSum, sum);
        }

        
System.out.println(MaxSum);




    
    
}}
