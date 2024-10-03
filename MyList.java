import java.util.*;
public class MyList {
    public static void main(String[] args){
        List<String> colours=new ArrayList<>(5);
        colours.add("Red");
        colours.add("Orange");
        colours.add("Purple");
        colours.add("Yellow");
        System.out.println("Colours list"+colours);
        colours.add(0,"Blue");
        System.out.println("after adding the color in the 0th place"+colours);
        colours.remove(0);
        //colours.remove("element")
        colours.add("Orange");
        colours.remove("Orange");
        colours.remove("Orange");
        System.out.println("after removing the color in the 0th place"+colours);
        System.out.println(colours.isEmpty());
        System.out.println(colours.contains("Orange"));
        System.out.println(colours.size());
        System.out.println(colours.get(0));
        colours.set(0,"Pink");
        System.out.println("after updating the color in the 0th place"+colours);
        Collections.sort(colours);
        colours.clear();
        System.out.println(colours);



    }
    
}
