/**
 * Class that will contain the Cuisine and the name of the restaurant
 * and possibly more.
 */
public class Tuple {
    /**
     * The cuisine of the restaurant.
     */
    private String cuisine;

    /**
     * The name of the restaurant.
     */
    private String name;

    /**
     * The constructor for the Tuple.
     *
     * @param cui The cuisine of the restaurant.
     * @param nm The name of the restaurant.
     */
    public Tuple(String cui, String nm){
        this.cuisine = cui;
        this.name = nm;
    }

    /**
     * Get the cuisine of the restaurant.
     *
     * @return The cuisine.
     */
    public String getCuisine(){
        return this.cuisine;
    }

    /**
     * Get the name of the restaurant.
     *
     * @return The name.
     */
    public String getName(){
        return this.name;
    }
}
