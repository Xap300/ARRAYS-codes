import java.util.Scanner;

public class question17_IndexFound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give length of an array");
        int length=sc.nextInt();
        int index=0;

        System.out.println("give the elements of array ");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
           
        }
        System.out.println("give the numbe for index");
        int number=sc.nextInt();
        for(int i=0;i<length;i++){
             if(arr[i]==number){
                index=i;
            }
        }
System.out.print("the index is "+ index);

    }
    
}
