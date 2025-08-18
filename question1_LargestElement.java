import java.util.Scanner;
public class question1_LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("give the elements of the array");
         for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
int largest = arr[0];
for(int i=1;i<length;i++){
    if(arr[i]>largest){
        largest=arr[i];
    }
}

System.out.println(largest);
    }
    
}
