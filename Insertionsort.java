import java.util.Scanner;
import java.util.Random;
public class Insertionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();
        sc.close();
        int[] nums=new int[n];
        System.out.println("Before sorting:");
        for(int i=0;i<nums.length;i++){
            nums[i]=rand.nextInt(10);
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("Iterations:");
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j=j-1;
            }
            if (j < 0) {
                    nums[0] = key;
                } else {
                    nums[j + 1] = key;
                }
            for(int num:nums){
             System.out.print(num+" ");
            
            }
            System.out.println();

        }
        System.out.println("After sorting:");
        System.out.println();
        for(int num:nums){
            System.out.print(num+" ");
           
           }



    }
}
