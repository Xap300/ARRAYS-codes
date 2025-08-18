import java.util.Scanner;
public class RANDOM_Kmix {
static void reverse(int[]arr,int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }}

static void left(int[]arr,int k,int end){
        reverse(arr,0 , k-1);
        reverse(arr, k, end-1);
        reverse(arr, 0, end-1);
}

static void right(int[]arr,int k,int end){
    reverse(arr, 0, end-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, end-1);
}

public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        int[] arr=new int[length];
        System.out.println("give the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}
            System.out.println("give the Rotation length");
            int k=sc.nextInt();

    System.out.println("give direction(L=LEFT , R= RIGHT)");
    char ch=sc.next().toUpperCase().charAt(0);
    if(ch=='L'){
        left(arr, k, arr.length);
    }
    else if(ch=='R'){
        right(arr, k, arr.length);
    }
    else{
        System.out.println("in valid input");
    }

    for (int i : arr) {
        System.out.print(i);
        
    }
}}
