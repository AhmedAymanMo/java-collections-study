package lists;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);//[1, 2, 3]

        //Access element
        System.out.println(numbers.get(1));//2
        
        //Update an element. set(index,element)
        numbers.set(1,9);//[1,9,3]

        //Remove an element.   you can also use the index
        numbers.remove((Integer) 9);
        System.out.println(numbers);//[1, 3]

        System.out.println(numbers.size());//2

        //foreach
        for(Integer num:numbers)
            System.out.println(num);

        numbers.clear();
        System.out.println(numbers.size());//0
    }


}
