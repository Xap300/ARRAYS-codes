import java.util.Scanner;

public class question24_SeprateElementsEvenOdd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
    int length=sc.nextInt();
    int[]arr=new int[length];

    System.out.println("give elements of array");
    for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();
    }
System.out.println("evens and odds are");
    for (int i : arr) {
        if(i%2==0){
            System.out.println("even-> "+i);
        }
        else{
            System.out.println("odd->"+i);
        }
        
    }

    
}}