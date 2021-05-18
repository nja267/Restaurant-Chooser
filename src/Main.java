import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class for the program. Extends the GUI abstract class.
 * Has a main function and also implements the methods necessary.
 */
public class Main extends GUI {

    private Map<Integer, Tuple> restaurantData;

    @Override
    protected void loadData(File restoData) {
        this.restaurantData = Parser.parseRestaurantFile(restoData);
    }

    public static void main(String[] args){
//        Parser p = new Parser();
//        File test = new File("C:/Users/nicho/IdeaProjects/Restaurant-Chooser/data/testing-file.txt");
//        Map<Integer, Tuple> map = p.parseRestaurantFile(test);
//        for(int id : map.keySet()){
//            System.out.println("ID: " + id + " Name: " + map.get(id).getName() + " Cuisine: " + map.get(id).getCuisine());
//        }
        new Main();
    }

}
