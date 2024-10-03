public class Interface {
    public static void main(String[] args){
        Computer obj=new Computer(){
            public void code(){
                System.out.println("Code.....");
            }
        };
        Computer lap=new Laptop();
        Computer des=new Desktop();
        obj.code();
        lap.code();
        des.code();
    }
    
}

interface Computer{
void code();

//All methods in Interface are public abstract we don't specify the methos as public abstract 

}
class Laptop implements Computer{
public void code(){
    System.out.println("Code,compile,run,travel");
}
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code....");
    }
}
