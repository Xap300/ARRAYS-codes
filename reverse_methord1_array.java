import java.util.Scanner;
public class reverse_methord1_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        int[] arr=new int[length];
        System.out.println("give the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[]reverse=new int[length];

        for(int i=0;i<length;i++){
        
            reverse[i]=arr[length-1-i];
        
        }
for(int i=0;i<length;i++){
System.out.print( reverse[i]+"");

    }
    }
}
