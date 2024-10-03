public class Encpsulation {
    public static void main(String args[]){
        Human obj=new Human("Mythili",21);
        Human obj1=new Human();
        obj1.getName();
        obj1.getAge();
        obj.getName();
        obj.getAge();
        obj1.setName("Monisha");
        obj1.setAge(32);
        obj1.getName();
        obj1.getAge();

        
    }
}
class Human{
    private String name;
    private int age;
    public Human()
    {   
        System.out.println(name+": "+age);
    }
    public Human(String name,int age)
    {   this.name=name;
        this.age=age;
        System.out.println(name+": "+age);
    }
    public String getName(){
        System.out.println("Name: "+name);
        return name;
    }
    public int getAge(){
        System.out.println("Age: "+age);
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }


}