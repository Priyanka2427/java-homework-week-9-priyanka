package homeworkweek9;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSet {

    // Method to check if a number is in the set
    public static boolean isNumberInSet(Set<Integer> set, int number) {
        return set.contains(number);
    }

    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers between 1 and 10 that are in the set: ");
        for (int i = 1; i <= 10; i++) {
            if (isNumberInSet(numberSet, i)) {
                System.out.println(i + " ");
            }
        }
    }
}
