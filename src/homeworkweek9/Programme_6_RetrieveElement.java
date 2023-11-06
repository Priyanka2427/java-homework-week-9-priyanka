package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {

    // Method to retrieve an element from an ArrayList at a specified index
    public static int retrieveElement(ArrayList<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            return -1; // Return a special value to indicate an invalid index
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int indexToRetrieve = 2;
        int retrievedElement = retrieveElement(numbers, indexToRetrieve);

        if (retrievedElement != -1) {
            System.out.println("Element at index " + indexToRetrieve + " : " + retrievedElement);
        }else {
            System.out.println("Invalid index");
        }


    }
}
