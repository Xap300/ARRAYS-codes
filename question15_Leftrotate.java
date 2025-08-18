import java.util.Scanner;
public class question15_Leftrotate {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        for(int i=0;i<length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[length-1]=first;
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    
}