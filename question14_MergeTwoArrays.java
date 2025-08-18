import java.util.Scanner;

public class question14_MergeTwoArrays {
    public static void main(String[] args) {
        
    
      Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length1=sc.nextInt();

        int[]arr1=new int[length1];
        System.out.println("give elements of array1");
        for(int i=0; i<length1;i++){
            arr1[i]=sc.nextInt(); }


              
        System.out.println("give the length of2 array");
        int length2=sc.nextInt();

        int[]arr2=new int[length2];
        System.out.println("give elements of second array");
        for(int i=0; i<length2;i++){
            arr2[i]=sc.nextInt(); }



            // merge array ------->
        
        int final_length=length1+length2;

        int[]arr=new int[final_length];
        System.out.println("give elements of array");
        for(int i=0; i<length1;i++){
            arr[i]=arr1[i]; }
             for(int i=0; i<length2;i++){
            arr[length1+i]=arr2[i]; }

for (int i : arr) {
    System.out.print(i);
    
}

    
}}
