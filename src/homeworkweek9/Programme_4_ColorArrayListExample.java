package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColorArrayListExample {


    public static void addColors() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors in the ArrayList : ");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        addColors();
    }
}