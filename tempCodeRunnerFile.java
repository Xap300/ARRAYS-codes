        System.out.println("give the length of array");
        int length2=sc.nextInt();

        int[]arr2=new int[length2];
        System.out.println("give elements of second array");
        for(int i=0; i<length2;i++){
            arr2[i]=sc.nextInt(); }



            
        
        int final_length=length1+length2;

        int[]arr=new int[final_length];
        System.out.println("give elements of array");
        for(int i=0; i<length1;i++){
            arr[i]=arr1[i]; }
             for(int i=length1; i<final_length;i++){
            arr[i]=arr2[i]; }
