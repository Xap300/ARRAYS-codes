import java.util.Scanner;

public class question21_DeleteElement {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.println("give length of the array");
        int length=sc.nextInt();
        int[]arr=new int[length];
        int[]new_arr=new int[length-1];
        
    
        System.out.println("give elements of array");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
            
        } 
         
        System.out.println("give the index where u want to delete");
        int index=sc.nextInt();

        for(int i=0;i<index;i++){
            new_arr[i]=arr[i];
        }
        for(int i=index;i<length-1;i++){
            new_arr[index]=arr[index+1];
        }
System.out.println("arr after deletion");
for (int i : new_arr) {
    System.out.print(i+"");
}


        
        
    }
    
}
