package Medium;

import java.util.Arrays;
import java.util.Scanner;



public class Triple_Sum_problem {
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

        System.out.println("give the sum");
        int target=sc.nextInt();
        boolean found=false;

        // fixing 1 element and doing logic---->

        for(int i=0;i<length-2;i++){
            int left=i+1;       // pointer just after i
            int right=length-1; // pointer at end
                while(left<right){
                    int sum=arr[i]+arr[right]+arr[left];

                    if(sum==target){
                        found=true;
                        System.out.println(arr[i]+"+"+arr[right]+"+"+arr[left]+"="+target);
                        left++;
                        right--; // to find all the possible outcomes
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
            }





        }
        if(!found){
            System.out.println("not found");
        }
        
    
    
}}
