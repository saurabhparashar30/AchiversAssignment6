package Arrays_3;

import java.util.Scanner;


public class One {
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
            sort(arr);
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr){
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < arr.length - 1; i++){ 
            swapped = false; 
            for (j = 0; j <arr.length - i - 1; j++){ 
                if (arr[j] > arr[j + 1]){
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            }
            if (swapped == false) 
                break; 
        } 
    }
}
