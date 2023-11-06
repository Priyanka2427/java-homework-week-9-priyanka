package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    // Method to iterate through the values in the map using a for-each loop
    public static void iterateMapValues(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap() ;
        people.put("Alice",25);
        people.put("Bob",30);
        people.put("Charlie",22);
        people.put("David",28);


            iterateMapValues(people);
        }

    }

