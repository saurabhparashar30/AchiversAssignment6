package Arrays_3;

import java.util.Scanner;


public class Nine {
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
            System.out.println("Enter k");
            System.out.println("Index of k is "+kthIndex(arr,s1.nextInt()));
        }
    }
    static int kthIndex(int[] arr,int k){
        if (arr == null) { 
            return -1; 
        }
        int len = arr.length; 
        int i = 0; 
        while (i < len) {
            if (arr[i] == k) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }
}
