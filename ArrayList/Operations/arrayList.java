import java.util.*;
//operations of Array List using java.
public class arrayList{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Prasanna");
        names.add("Elon");
        names.add("Mark");
        names.add("Trump");
        System.out.println("Before change: "+names);
        names.set(3,"Putin");
        System.out.println("After changes: "+names);
        names.remove(1);
        System.out.println("After removing: "+names);
        System.out.println("Size of array: "+names.size());
        System.out.println("Does the array contains Mark?\n"+names.contains("Mark"));
        System.out.println("Is the array empty: "+names.isEmpty());

    }
}