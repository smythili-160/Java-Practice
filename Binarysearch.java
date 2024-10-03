import java.util.Scanner;
import java.util.Random;

public class Binarysearch {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    Random rand=new Random();
    System.out.println("Enter the length of the array:");
    int n= sc.nextInt();
    int[] num=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<num.length;i++){
        num[i]=rand.nextInt(10);// Generate random numbers between 0 and 99
        System.out.print(num[i]+" ");
        
    }
    int temp=0;
        for(int i=0;i<num.length;i++){
            
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                
                    }
                    
        }

                }
                sc.close();
    System.out.println("Sorted array:");
    for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
        
    }
   
    System.out.println("\nEnter the target");
    int target=sc.nextInt();
    int result=bs(num,target,0,num.length-1 );
  
    if(result==-1){
        System.out.println("the target is not found");

    }
    else{
        System.out.println("Target found at index "+result);
    }


}
public static int bs(int[] nums,int target,int left,int right){
   
    while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]==target){
            System.out.println(mid+" ");
            return mid;
        }
        else if (nums[mid]>target) {
            right=mid-1;
            
        }
        else if(nums[mid]<target){
            left=mid+1;
            
        }
    }
    return -1;

}
}
