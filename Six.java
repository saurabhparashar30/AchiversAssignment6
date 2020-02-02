package Arrays_3;

import java.util.Scanner;


public class Six {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter testcases");
        int t=s1.nextInt();
        while(t--!=0){
            System.out.println("Enter M, N");
            int[][] arr=new int[s1.nextInt()][s1.nextInt()];
            System.out.println("Enter elements");
            for(int i=0;i<arr.length;i++)
                for(int j=0;j<arr[i].length;j++)
                    arr[i][j]=s1.nextInt();
            arr=setMatrix(arr);
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }
    }
    public static int[][] setMatrix(int[][] arr){
        int mat[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    for(int k=0;k<arr[j].length;k++)
                        mat[i][k]=1;
                    for(int k=0;k<arr.length;k++)
                        mat[k][j]=1;
                }
            }
        }
        return mat;
    }
}
