import java.util.Random;
import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
          
        }
        for(int num: arr){
            System.out.print(num+" ");

        }
        System.out.println();
        ms(arr, 0, arr.length - 1); 
        System.out.println("After sorting");
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    private static void ms(int[] arr, int low, int high) {
        if(low<high){
            int mid=(low+high)/2;
            ms(arr,low,mid);
            ms(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
       
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;
        int k=low;
        int[] lArray=new int[n1];
        int[] rArray=new int[n2];
        for(int x=0;x<n1;x++){
            lArray[x]=arr[x+low];
        }
        for(int x=0;x<n2;x++){
            rArray[x]=arr[x+mid+1];
        }
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
        if(lArray[i]<rArray[j]){
            arr[k]=lArray[i];
            k++;
            i++;
        }
        else{
            arr[k]=lArray[j];
            k++;
            j++;

        }

        }

    

    
}
}
