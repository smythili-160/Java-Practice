import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args){        
        System.out.println("Enter the no. of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        int[] num=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            
        }
        bubblesort(num);
        System.out.println("Sorted array:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    

    }
    public static void bubblesort(int[] nums){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    System.out.println("");
                    for(int n=0;n<nums.length;n++){
                        System.out.print(nums[n] + " ");
                    }
                    
        }

                }
                
            
            }
            

        }
        

    }
   

    
