import java.util.Scanner;

public class even_odd_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give array length");
        int length=sc.nextInt();
        int[]arr=new int[length];

        int count_even=0;
        int count_odd=0;

        System.out.println("give the element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(arr[i]%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
            
        }
        System.out.println("total even "+ count_even);
        System.out.println("total odd "+ count_odd);
    
}
}