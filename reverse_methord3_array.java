import java.util.Scanner;

public class reverse_methord3_array {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        int[] arr=new int[length];
        System.out.println("give the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
 
        // USING FOR EACH LOOP--->
        
        int[]rev=new int[length];
        int index=length-1;
        for(int var:arr){
            rev[index]=var;
            index--;
            
        }
     for(int var:rev){
        System.out.print(var);
     }

}
}