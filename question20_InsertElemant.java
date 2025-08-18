import java.util.Scanner;

public class question20_InsertElemant {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("give length of the first array");
        int length=sc.nextInt();
        int[]arr=new int[length];
        int[]new_arr=new int[length+1];
        
    
        System.out.println("give elements of first array");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("give the element to insert");
        int element=sc.nextInt();

        System.out.println("give the index where u want to inset");
        int index=sc.nextInt();
        
        
        for(int i=0;i<index;i++){
            new_arr[i]=arr[i];
             }
             new_arr[index]=element;
        for(int i=index;i<length;i++){
            new_arr[i+1]=arr[i];
        }     
        System.out.println("array after insertion is ");

for (int i : new_arr) {
    System.out.print(i+" ");
}

    }
    
}
