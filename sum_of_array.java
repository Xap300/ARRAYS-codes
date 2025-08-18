import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("give elemnts");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        System.out.println(sum);
        
    }
    
}
