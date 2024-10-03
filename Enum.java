enum Status{
    Running,Success,Failed,Pending
}
public class Enum {
  public static void main(String[] args){
    Status obj= Status.Success;
    System.out.println(obj);
    Status[] ss=Status.values();
    System.out.println(obj.ordinal());
    for(Status num:ss){
        System.out.print(num+" ");
    }
  }  
}
