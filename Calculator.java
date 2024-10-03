import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        /*Calc x=new Calc();
        x.add(25,12);
        x.sub(25,12);
        x.mul(25,12);
        x.div(25,12);
        x.mod(25,12);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num2: ");
        int num2=sc.nextInt();
        AddNum sum=new AddNum();
        System.out.println("the sum of num1 and num2 is: "+sum.add(num1, num2));
        sc.close();
    }
}
class Calc{
    public int add(int a,int b){
        int r = a+b;
        System.out.println("add:"+r);
        return r;
    }
    public int sub(int a,int b){
        int r = a-b;
        System.out.println("sub:"+r);
        return r;
    }
    public int mul(int a,int b){
        int r = a*b;
        System.out.println("mul:"+r);
        return r;
    }
    public int div(int a,int b){
        int r = a/b;
        System.out.println("div:"+r);
        return r;
    }
    public int mod(int a,int b){
        int r = a%b;
        System.out.println("mod:"+r);
        return r;
    }
}
class AddNum{
    public int add(int a, int b){
        return a+b;
    }

}