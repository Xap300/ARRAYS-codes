import java.util.Scanner;

public class question13_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();
        boolean[] track=new boolean[length];
        int[]arr=new int[length];
        System.out.println("give the elements of array");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
            track[i]=false;
        }

        for(int i=0;i<length;i++){
            if(track[i]){
                continue;
            }
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    track[j]=true;
                }
            }
            System.out.print(arr[i]+"");
        }






    }
    
}
