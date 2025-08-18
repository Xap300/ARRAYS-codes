import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("give elemnts");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give element to find");
        int input=sc.nextInt();
        boolean found=false;

        for(int val:arr){
            if(val==input){
                found=true;
                break;
            }
        }

        if(found){
            System.out.println("yes "+input+" is in array");
        }
        else{
            System.out.println("not in array");
        }
    }
    
}
