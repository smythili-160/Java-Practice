import java.util.Scanner;
import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          
        }
        System.out.println();
       
        qs(arr, 0, arr.length - 1); 
        System.out.println("After sorting");
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            qs(arr, low, pi - 1);
            qs(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
     
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
    }
}
