import java.util.Scanner;
public class question22_AllSumPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("GIVE THE LENGTH ");
        int length=sc.nextInt();
System.out.println("give the elements");
        int[]arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the sum");
        int number=sc.nextInt(); 
         for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(arr[i]+arr[j]==number){
                    System.out.println(arr[i]+" and "+arr[j]);   
                }
            }

         }
        
        

        



    }
    
}
