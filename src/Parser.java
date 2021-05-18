import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Utility class used to parse through the file(s) using methods
 * that will return the relevant data in data structure.
 */
public class Parser {

    /**
     * Parses the given file and puts the corresponding values into a map.
     *
     * @param resto The file that contains the Cuisine and the Name of the restaurants.
     * @return The map of the restaurants with the cuisine as the key and the restaurant name as the value.
     */
    public static Map<Integer, Tuple> parseRestaurantFile(File resto){
        Map<Integer, Tuple> outputMap = new HashMap<>();

        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(resto));
            int id = 0;
            String line;

            //skipping the first line as it is the header
            buffRead.readLine();

            //reading in each line of the given file
            while((line = buffRead.readLine()) != null){
                String[] info = line.split("[,]+");

                String cuisine = info[0];
                String name = info[1];

                Tuple tuple = new Tuple(cuisine, name);

                outputMap.put(id, tuple);
                id++;
            }
            buffRead.close();
        } catch (IOException e) {
            //throw new RuntimeException("Reading the restaurant file has failed.");
            e.printStackTrace();
        }

        return outputMap;
    }
}
