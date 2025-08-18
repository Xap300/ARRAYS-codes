//package Medium;

import java.util.Scanner;

public class MoveAllZerosLeft {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        System.out.println("give the elements");
        int[]arr=new int[length];
         for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int j=length-1;
    for(int i=length-1;i>=0;i--){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j--;
        }

    }

    while(j>=0){
        arr[j]=0;
        j--;
        
    }


for (int i : arr) {
    System.out.print(i+" ");
    
}






}}
