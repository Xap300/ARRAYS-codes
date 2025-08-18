import java.util.Scanner;

public class question5_ReverseArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("give the elements of the array");
         for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<length/2;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[length-1-i];
        //     arr[length-1-i]=temp;
        // }
int[] reverse=new int[length];
for(int i=0;i<length;i++){
for(int var:arr){
reverse[length-1-i]=var;
length--;
}
}





        System.out.print(" rever array is ");
        for(int var:reverse){
            System.out.print(var+" ");
        }
   
   
   
    }}
