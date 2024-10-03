@FunctionalInterface
interface H{
    void sayHello();
}
@FunctionalInterface
interface Add{
 int add(int i,int j);
    
}
public class LambdaExpression {
    public static void main(String[] args){
        H h= ()-> {
                System.out.println("hello");

        };
        h.sayHello();
        Add a=(i,j)->i+j;
        int result=a.add(1, 2 );
        System.out.println(result);


    }
    
}
