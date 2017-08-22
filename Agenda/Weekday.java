import java.util.HashMap;
import java.util.Map;

/**
 * The seven names given to 24-hour periods in the Gregorian Calendar.
 * 
 * @author James Pede
 * @version Jul12'14,1600h
 */
public enum Weekday
{
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    
    private String literal;

    private static Map<String, Weekday> lookup = new HashMap<String, Weekday>();
    
    /**
     * To look up value of enum
     */
    static{
        for (Weekday w : Weekday.values()){
            lookup.put(w.toString(), w);
        }
    } // end class init

    /**
     * Mutator.
     * @param literal to set value to WeekDay
     */
    private Weekday(String literal) {
        this.literal = literal;
    } // end constructor
    
    /**
     * To create a WeekDay enum from a String
     * @param searchTerm the weekday
     */
    public static Weekday get(String searchTerm) {
        return lookup.get(searchTerm);
    } // end method

    /**
     * Accessor.
     * @return theWeekDay attribute as a String
     */
    public String toString() {
        return literal;
    } // end accessor
} // end class
