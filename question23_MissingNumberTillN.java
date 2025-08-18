import java.util.Scanner;

public class question23_MissingNumberTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
    int length=sc.nextInt();
    int[]arr=new int[length];
    int sum=0;
    System.out.println("give elements of array");
    for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();
         sum+=arr[i];
    }
System.out.println(sum);
    // finding missing element--->

    int max= ((length+1)*(length+2))/2;
    int number=max-sum;

    System.out.println("the number is--> "+number);








    }
    
}
