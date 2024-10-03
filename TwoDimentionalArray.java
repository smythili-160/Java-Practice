import java.util.*;
class Data {
    int value;
    String str;

    public Data(int value, String str) {
        this.value = value;
        this.str = str;
    }
}
 class M {
    public static void main(String[] args){
Data[] array = new Data[3];

array[0]= new Data(10, "Hello");
array[1] = new Data(20, "World");
array[2] = new Data(30, "Java");


// Accessing the elements
System.out.println(array[0].value); // prints 10
System.out.println(array[0].str); // prints Hello

System.out.println(array[1].value); // prints 20
System.out.println(array[1].str); // prints World

System.out.println(array[2].value); // prints 30
System.out.println(array[2].str); // prints Java

    }
}