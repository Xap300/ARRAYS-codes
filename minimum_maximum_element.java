import java.util.Scanner;
public class minimum_maximum_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        int[]arr=new int[length];
        System.out.println("give "+length+" elements");


        arr[0]=sc.nextInt();
         int max=arr[0];
         //int min=Integer.MAX_VALUE;
         int min=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(max<arr[i]){
                max=arr[i];
            }


            if(arr[i]<min){
                min=arr[i];
            }
        }
       System.out.println("grates element "+ max);
       System.out.println("smallest element "+ min);

        



        
    }
    
}
