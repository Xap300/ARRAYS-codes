import java.util.Scanner;

public class reverse_methord2 {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        int[] arr=new int[length];
        System.out.println("give the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }

         for(int i=0;i<length/2;i++){

            int temp=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;

            
         }
for(int var:arr){
    System.out.print(var);
}





    }

    
}
