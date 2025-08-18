import java.util.Scanner;

public class question7_SearchElement {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the element to search");
        int element=sc.nextInt();
        boolean IsFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                IsFound=true;
                break;
            }
        }
if(IsFound){
    System.out.println("✅ Element is in the array");
}
else{
    System.out.println("no elemene is not there");
}
    
    
    
    
    
    
    
    
    }}
