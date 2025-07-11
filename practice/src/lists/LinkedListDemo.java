package lists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        //Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Goat");

        System.out.println(animals);

        //Add at first and last O(1)
        animals.addFirst("Lion");
        animals.addLast("Elephant");//same as add
        System.out.println(animals);

        //Access elements
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        System.out.println(animals.get(3));//O(n)  and O(1) in ArrayList

        //Remove elements
        animals.remove("Cat"); // remove by value
        animals.removeFirst(); // remove first element
        animals.removeLast();  // remove last element
        System.out.println(animals);

        //Iterate using for-each loop
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
