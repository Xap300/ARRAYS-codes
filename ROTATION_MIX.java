import java.util.Scanner;

public class ROTATION_MIX {

//1 -- FOR LEFT ROTATION
    static void left(int[]arr,int fix){
        fix=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=fix;
    }


//2--- FOR RICHT ROTATION
    static void right(int[]arr,int fix){
        fix=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=fix;
    }
    
//3
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();
        System.out.println("give the element of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("ENTER DIRECTION(L=LEFT AND R=RIGHT)");
        char ch=sc.next().toUpperCase().charAt(0);

        if(ch =='L'){
            left(arr,arr[0] );
            for(int var:arr){
            System.out.print(var);
        }
        }
        else if (ch =='R') {
            right(arr, arr[arr.length-1]);
            for(int var:arr){
            System.out.print(var);
        }
            
        }
        else{
            System.out.println("invalid input");
        }
        
        
    }
}
