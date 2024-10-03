import java.util.Scanner;
import java.util.Random;;
public class Selectionsort {
    public static void main(String[] args){
        int min=0;
        int temp=0;
        System.out.println("Enter the number of the array elements:");
        Scanner sc =new Scanner(System.in);
        Random rand=new Random();
        int n= sc.nextInt();
        sc.close();
        int[] nums=new int[n];
        System.out.println("Before sorting:");
        for(int i=0;i<nums.length;i++){
            nums[i]=rand.nextInt(10);

        }
        for(int num: nums){
            System.out.print(num+" ");

        }
        System.out.println();
        System.out.println("Iterations:");
        for(int i=0;i<nums.length-1;i++){
            min=i;
            for(int j=i+1;j<nums.length;j++){
              if(nums[min]>nums[j]){
                temp=nums[min];
                nums[min]=nums[j];
                nums[j]=temp;
              }  
              
            }
            for(int num: nums){
                System.out.print(num+" ");
    
            }

            System.out.println();
            
        }
        System.out.println("After sorting:");
        for(int num: nums){
            System.out.print(num+" ");

        }



    }
    
}
