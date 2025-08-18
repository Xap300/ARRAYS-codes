import java.util.Arrays;
import java.util.Scanner;

import org.xml.sax.SAXException;

public class TwoPointer_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give length of array");
        int length=sc.nextInt();

        System.out.println("give the elements");
        int[]arr=new int[length];
         for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        // two pointer logic----->
        boolean found=false;
        int left=0;
        int right=length-1;
        System.out.println("give the sum ");
        int target=sc.nextInt();

        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                found=true;
                System.out.println("Pair sum of "+arr[left]+" + "+arr[right] +" is "+target);
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }

        }

if(!found){
    System.out.println("no pair");
}

}}
