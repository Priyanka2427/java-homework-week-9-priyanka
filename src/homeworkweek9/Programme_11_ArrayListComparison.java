package homeworkweek9;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayListComparison {


    // Method to check if two ArrayLists are equal
    public static boolean areArrayListsEqual(ArrayList<String> list1, ArrayList<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (String element : list1) {
            if (!list2.contains(element)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Check if the two Arraylists are equal
        boolean areEqual = areArrayListsEqual(c1, c2);

        if (areEqual) {
            System.out.println(" The two ArrayLists are equal");
        } else {
            System.out.println("The two arrayLists are not equal");
        }

    }
}
