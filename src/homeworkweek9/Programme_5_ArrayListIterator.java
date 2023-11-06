package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_ArrayListIterator {

    public static void iterateArrayList(ArrayList<String> list) {
        // Create an iterator to iterate through the ArrayList
        Iterator<String> iterator = list.iterator();

        // use a while loop to iterate through the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Call the method to iterate through the ArrayList
        iterateArrayList(arrayList);
    }
}

