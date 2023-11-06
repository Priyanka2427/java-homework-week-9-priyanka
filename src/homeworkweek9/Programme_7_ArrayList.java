package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add element to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        boolean isEmpty = isArrayListEmpty(numbers);

        if (isEmpty) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The Arraylist is not empty");

        }
    }


    // Method to check if an ArrayList is empty
    public static boolean isArrayListEmpty(ArrayList<?> list) {
        return list.isEmpty();

    }


}
