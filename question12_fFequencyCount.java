import java.util.Scanner;

public class question12_fFequencyCount {
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
        System.out.println("give the length of array");
        int length=sc.nextInt();
        

        int[]arr=new int[length];
        boolean[]check=new boolean[length];
        System.out.println("give elements of array");
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
            check[i]=false;
        }
    
        for(int i=0;i<length;i++){
            if(check[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    check[j]=true;
                }
            }

System.out.println(arr[i]+" --> "+count);


        }
        
        
    
    
}}
