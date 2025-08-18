 import java.util.Scanner;
import java.util.Arrays;
public class question11_ascendingDescending {
    static void assending(int[]arr){
        Arrays.sort(arr);

        // MORE SORTING METBHORDS------>
        
    }

    static void descendin(int[]arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
    }
   

     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt(); }

            System.out.println("choose the order");
            System.out.print("1=assending and  2=descending = ");
            int order=sc.nextInt();
            if(order==1){
                assending(arr);
            }
            else if(order==2){
                descendin(arr);
            }
            else{
                System.out.println("invalid input");
            }
    

        for (int i : arr) {
            System.out.print(i);
            
        }
    
}}

    

