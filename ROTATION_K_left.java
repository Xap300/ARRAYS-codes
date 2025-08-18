import java.util.Scanner;

public class ROTATION_K_left {
    static void reverse(int[]arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        } }

  public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of the array");
        int length=sc.nextInt();
        System.out.println("give the elements of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the location where u want to rotate");
        int k=sc.nextInt();

        reverse(arr, 0, k-1);    //REVERSE FIRST K
        reverse(arr, k, length-1);        // REVERSE REMAINING K
        reverse(arr, 0, length-1);  // REVERSE WHOLE ARRAY 

        for(int var:arr){
            System.out.print(var);
        }
  
        




}}
