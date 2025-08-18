import java.util.Scanner;
public class ROTATION_right {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the length of the array");
        int length=sc.nextInt();
        System.out.println("give the elements of array");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

//  ROTATION------->

int last=arr[length-1];
for(int i=length-1;i>0;i--){
    arr[i]=arr[i-1];
}
arr[0]=last;

for(int var:arr){
    System.out.print(var);
}
    }
    
}
