import java.util.Scanner;

public class Linearsearch{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int n= sc.nextInt();
    int[] num=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<num.length;i++){
        int r=sc.nextInt();
        num[i]=r;
    }
    System.out.println("Enter the target");
    int target=sc.nextInt();
    System.out.println(target);
    int result=ls(num,target);
    if(result==-1){
        System.out.println("the target is not found");

    }
    else{
        System.out.println("Target found at index "+result);
    }

    sc.close();

}
public static int ls(int[] num,int target){
    for(int i=0;i<num.length;i++){
        if(num[i]==target){
            return i;
        }
        
    }
    return -1;

}

    
}
