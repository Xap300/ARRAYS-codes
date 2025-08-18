import java.util.Scanner;

public class question8_SecondLargest {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        int maximum=0;
        int secondmax=0;
       
        for(int i=0; i<length;i++){
            if(arr[i]>maximum){
                secondmax=maximum;
                maximum=arr[i];
                
            }
            
        }

        System.out.println(secondmax);

       
    }
    
}
