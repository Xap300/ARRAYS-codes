import java.util.Scanner;
import java.util.Arrays;
public class question10_AscendingOrder {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print("assending order is "+i+" ");
            
        }
    
}}
