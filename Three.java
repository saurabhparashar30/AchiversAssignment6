package Arrays_3;

import java.util.Scanner;


public class Three {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter testcases");
        int n=s1.nextInt();
        while(n--!=0){
            System.out.println("Enter size");
            int arr[]=new int[s1.nextInt()];
            System.out.println("Enter elements");
            for(int i=0;i<arr.length;i++)
                arr[i]=s1.nextInt();
            System.out.println("Max sum is "+findSum(arr));
        }
    }
    static int findSum(int[] a){
        int size = a.length; 
        int max = Integer.MIN_VALUE, max_here = 0;
        for (int i = 0; i < size; i++){ 
            max_here = max_here + a[i]; 
            if (max < max_here) 
                max = max_here; 
            if (max_here < 0) 
                max_here = 0; 
        } 
        return max; 
    }
}
