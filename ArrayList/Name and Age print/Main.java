import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Pachaiappan",55));
        list.add(new Person("Sandhana Maari",56));
        list.add(new Person("Munusaamy",67));
        list.add(new Person("Chokkalingam",88));
        System.out.println(list.toString());

       Person p1 = list.get(0);
        System.out.println("First person is "+p1.name+"\nAge is "+p1.age);

    for(Person i: list){
        System.out.println(i);
         }
    }
}

