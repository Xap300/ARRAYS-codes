import java.util.Scanner;

public class ROTATION_left {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the length of the array");
        int length=sc.nextInt();
        System.out.println("give the elements of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
    
        //ROTATION----->
        int first=arr[0];
        for(int i=0;i<length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[length-1]=first;

        for(int var:arr){
            System.out.print(var);
        }
}
}