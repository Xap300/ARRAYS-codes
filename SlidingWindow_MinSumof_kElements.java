import java.util.Scanner;

public class SlidingWindow_MinSumof_kElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("give the length of array ");
        int length =sc.nextInt();
    
        System.out.println("give the length of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("give the number of consecutive elements  ");
        int k=sc.nextInt();
        int min=0;
        for(int i=0;i<k;i++){
            min+=arr[i];
        }

        int MinSum=min;

        for(int i=k;i<length;i++){
            min+=arr[i]+arr[i-k];
            MinSum=Math.min(MinSum, min);
        }

    System.out.println(MinSum);
        
        
    
    
}}
