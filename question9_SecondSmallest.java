import java.util.Scanner;
public class question9_SecondSmallest {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        int minimum=Integer.MAX_VALUE;
        int secondmin=0;
       
        for(int i=1; i<length;i++){
            if(arr[i]<minimum){
                secondmin=arr[i];
                minimum=arr[i];
                
            }
            
        }

        System.out.println("second mnimum is "+secondmin);

       
    }
    
}

    

