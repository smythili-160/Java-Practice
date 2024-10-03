import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Maps {
    public static void main(String[] args){
        Map<String,Integer> stu=new TreeMap<String,Integer>();
        stu.put("Navin",56);
        stu.put("Mythili",45);
        stu.put("Savitri",57);
        System.out.println(stu);
        //Key must be unique whereas values need not be unique
        System.out.println(stu.keySet());
        int sum=0;
        for(String key:stu.keySet()){
            System.out.println(key+" : "+stu.get(key));
            sum=sum+stu.get(key);
        }
        System.out.println("The total score of the students:"+sum);

    }
}
