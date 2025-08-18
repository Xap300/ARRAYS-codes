import java.time.chrono.IsoChronology;
import java.time.temporal.IsoFields;
import java.util.Arrays;
import java.util.Scanner;
public class Leniar_Binary_SearchCombine {
    static boolean Leniar(int[]arr,int targate){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==targate){
                return true;
            }
        }
        return false;
    }
    static boolean Binary(int[]arr, int targate){
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==targate){
                return true;
            }
            else if(arr[mid]<targate){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
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

    

        // TAKE TARGATE ELEMENT
        System.out.println("give the element to search");
        int targate=sc.nextInt();

        //CHOICE FOR LENIAR OR BINARY SEARCH---
        System.out.println("which search approch you want to choose ");
        System.out.print(" 1 for LENIAR and ");
        System.out.print(" 2 for BINARY ");
        int approch=sc.nextInt();
          boolean IsFound=false;

        if(approch==1){
             IsFound=Leniar(arr, targate);
        }
        else if(approch==2){
         IsFound= Binary(arr, targate);
        } 
        else{
            System.out.println("INVALID OPTION");
        }
    
        if(IsFound){
            System.out.println("you use approch "+   approch   +" and element is prsent");
        }
        else{
             System.out.println("you use approch "+   approch   +" and element is not prsent");
        }
    
}}
