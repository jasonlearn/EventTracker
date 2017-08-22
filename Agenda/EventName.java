import java.util.HashMap;
import java.util.Map;

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
     * Mutator
     * @param to set the variable for theEventName
     */
    private EventName(String theEventName) {
        this.theEventName = theEventName;
    } //end mutator

    /**
     * Accessor.
     * @return theEventName attribute as a String
     */
    public String getTheEventName() {
        return theEventName;
    } //end accessor
    
    /**
     * the following method allows me to create a EventName enum from a String!
     */
    public static EventName get(String theEventName) {
        return lookup.get(theEventName);
    } //end method
} //end class