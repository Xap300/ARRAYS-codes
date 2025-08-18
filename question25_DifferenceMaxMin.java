import java.util.Arrays;
import java.util.Scanner;

public class question25_DifferenceMaxMin {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
    int length=sc.nextInt();
    int[]arr=new int[length];

    System.out.println("give elements of array");
    for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();}

        Arrays.sort(arr);

        int sum= arr[length-1]-arr[0];
        System.out.println(sum);
        
        
    
    


    }}
