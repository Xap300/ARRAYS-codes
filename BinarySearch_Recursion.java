import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursion {
   public static boolean binarysearch(int[]arr,int left,int right,int targate){
        if(left>right){
            return false;
        }
        int mid=(left+right)/targate;
        if(arr[mid]==left){
            return true;
        }
        else if(arr[mid]<targate){
            return binarysearch(arr, mid+1, right, targate);
        }
        else{
            return binarysearch(arr, left, mid-1, targate);
        }
}
public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

         // LENGTH OF ARRAY 
        System.out.println("give the length of array");
        int length=sc.nextInt();

        //INITIALIZE AND TAKE ELEMENTS OF ARRAY
        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }

        // SORT ARRAY
        Arrays.sort(arr);

        // TAKE TARGATE ELEMENT
        System.out.println("give the element to search");
        int targate=sc.nextInt();
        boolean IsFound=binarysearch(arr, targate, length, targate);  
    
if(IsFound){
    System.out.println("element present");

}
else{
    System.out.println("not present");
}
}}
