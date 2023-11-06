package homeworkweek9;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array :  ");
        printArray(originalArray);

        int[] reversedArray = reverse(originalArray);

        System.out.println(" \nReversed Array :  ");
        printArray(reversedArray);

    }

    public static int[] reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

}
