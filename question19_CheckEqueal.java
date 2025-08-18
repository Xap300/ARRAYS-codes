import java.util.Scanner;

public class question19_CheckEqueal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of the first array");
        int length=sc.nextInt();
        int[]arr=new int[length];
         boolean IsNotEqual=false;
        System.out.println("give elements of first array");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
            
        }

        System.out.println("give length of the second array");
        int length2=sc.nextInt();
        int[]arr2=new int[length2];
        System.out.println("give elements of second array");
        for(int i=0;i<length2;i++){
            arr2[i]=sc.nextInt();
            
        }

        if(length!=length2){
            System.out.println("not equal ");
        
        }
        else{

             for(int i=0;i<length;i++){
            if(arr[i]!=arr2[i]){
                IsNotEqual=true;
                break;
            }
            
        }
        if(IsNotEqual){
            System.out.println("arrays are not equal");
        }
        else{
            System.out.println("are equal");
        }
      
        }
          


       

            

            
                
            
        

    
    }
    
}
