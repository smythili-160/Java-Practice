/*  How to sort the elements of an array without using collections
Step 1-Sort an array
Step 2-Create a 2D array with the elemets and their frequency
 
 */
import java.util.*;
public class FrequencySort {
    static int x=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a, 0, a.length-1);
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        
        int[][] b=new int[a.length][2];
        b[x][0]=a[0];
        b[x][1]=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                b[x][1]=b[x][1]+1;
            }
            else{
                x++;
                b[x][0]=a[i];
                b[x][1]=1;
            }
        }
        x++;
        b=sort(b);
        for(int i=0;i<x;i++){
            for(int j=0;j<b[i][1];j++){
            System.out.print(b[i][0]+" ");}
        }
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]);

            }
            System.out.println();
        }
        sc.close();


    }
    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }


    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        int temp=0;
        for(int j=0;j<arr.length-1;j++){
            
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);

            }
           
        }
           temp=arr[i+1];
           arr[i+1]=arr[high];
           arr[high]=temp;
           return i+1;
        
    }
    public static void swap(int[] arr,int a,int b){
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int[][] sort(int b[][]){
        int[] c=new int[2];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(b[i][1]<b[j][1]){
                c=b[i];
                b[i]=b[j];
                b[j]=c;
            }

            }

        }
        return b;

    }
    
}
