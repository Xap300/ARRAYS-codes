import java.util.Scanner;

public class question6_CopyArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }

        int[]copy = new int[length];
        for(int i=0;i<length;i++){
            copy[i]=arr[i];
        }
System.out.println("copy of array is ");
        for (int i : copy) {
            System.out.print(i);
            
        }
    
    
    
    
    
    
    
    
    
    }}
