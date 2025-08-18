import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question18_MaxProductTwoInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give length of the array");
        int length=sc.nextInt();
        int[]arr=new int[length];

        System.out.println("give the elements of array");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[length-1]*arr[length-2];

        System.out.println("the maximum multiple of two integers are "+ max);

    }
    
}
