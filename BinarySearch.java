import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
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
        boolean IsFound=false;  // initialize boolian =false

        //BINARY SEARCH------>
        int left=0,right=length-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==targate){
                IsFound=true;
                break;
            }
            else if(arr[mid]<targate){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        if(IsFound){
            System.out.println("FOUND");

        }
        else{
            System.out.println("NOT FOUND");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    }}
