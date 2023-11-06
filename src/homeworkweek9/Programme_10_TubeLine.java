package homeworkweek9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_TubeLine {

    // Method to find the tube lines passing through a specific station
    public static void findLinesForStation(Map<String, Set<String>> stationsAndLines, String stationName) {
        Set<String> lines = stationsAndLines.get(stationName);

        if (lines != null) {
            System.out.println("Tube lines passing through " + stationName + ": " + lines);
        } else {
            System.out.println("Station not found in the dataset.");
        }
    }

    public static void main(String[] args) {
        // Create a sample dataset of Zone 1 stations and the lines that pass through them
        Map<String, Set<String>> stationsAndLines = new HashMap<>();
        stationsAndLines.put("Baker Street", Set.of("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
        stationsAndLines.put("Victoria", Set.of("Victoria"));
        stationsAndLines.put("Embankment", Set.of("Bakerloo", "Circle", "District", "Northern"));

        String stationName = "Embankment";
        findLinesForStation(stationsAndLines, stationName);
    }

}
