import java.util.HashMap;
import java.util.Map;

/**
 * Class EventName
 * @author Jason Chan A00698160
 * @version Assignment 3
 * subclass of Event
 * Has method to set eventName as a String
 * Has method to display event as a String
 */
public enum EventName {
	BIRTHDAY("birthday"),
	HOLIDAY("holiday"),
	OTHER("other");
	
	private String theEventName;
    private static Map<String, EventName> lookup = new HashMap<String, EventName>();
    
    /**
     * To lookup to values of the enum
     */
    static{ 
        for (EventName e : EventName.values()){
            lookup.put(e.getTheEventName(), e);
        }
    } //end method
    
    /**
     * Mutator Method.
     * @param to set the variable for theEventName
     */
    private EventName(String theEventName) {
        this.theEventName = theEventName;
    } //end mutator

    /**
     * Accessor Method.
     * @return theEventName attribute as a String
     */
    public String getTheEventName() {
        return theEventName;
    } //end accessor
    
    /**
     * Accessor Method.
     * the following method allows me to create a EventName enum from a String!
     */
    public static EventName get(String theEventName) {
        return lookup.get(theEventName);
    } //end method
} //end class