public final class Event extends Date implements Comparable<Event>{

    private EventName eventName;

    /**
     * Constructor to initialize Event
     * @param day to set attribute for day of class Event
     * @param month to set attribute for month of class Event
     * @param year to set attribute for year of class Event
     * @param eventType to set the variables for Event
     */
    public Event(int year, int month, int day, EventName eventName) {
        super(year, month, day);
        this.setEventName(eventName);
    } //end constructor

    /**
     * Overloading constructor to initialize Event
     * Takes a String as a parameter
     * @param day to set attribute for day of class Event
     * @param month to set attribute for month of class Event
     * @param year to set attribute for year of class Event
     * @param eventType to set the variables for Event
     */
    public Event(int year, int month, int day, String eventName){
        super(year, month, day);
        if(!(eventName.isEmpty())){
            this.setEventName(EventName.get(eventName));
        }
    } //end constructor
    
    /**
     * Accessor Method
     * @return day attribute
     */
    public int getDay() {
        return day;
    } //end accessor
    
    /**
     * Accessor Method
     * @return month attribute
     */
    public int getMonth() {
        return month;
    } //end accessor
    
    /**
     * Accessor Method
     * @return year attribute
     */
    public int getYear() {
        return year;
    } //end accessor

    /**
     * Accessor Method.
     * @return the eventType as a String
     */
    public String getTheEventNameString() {
        return eventName.getTheEventName();
    } // end method

    /**
     * Accessor Method.
     * @return eventName the event type of Event
     */
    public EventName getEventName() {
        return eventName;
    } // end accessor

    /**
     * Mutator Method.
     * @param eventName to set variable for eventName
     */
    public void setEventName(EventName eventName) {
        if ( eventName != null ) {
            this.eventName = eventName;
        }
    } // end mutator

    /**
     * Method to return Event as a String
     * @return event as a String
     */
    public String toString(){
        return Date.MONTH_OF_INDEX[getMonth() - JANUARY] + " " + getDay() + " " 
               + getYear() + " is " + getTheEventNameString().toLowerCase();
    } // end method

    /**
     * Method to compare two events dates.
     * @param thisEvent to compare with this event.
     * @return + if (this event is bigger) if it is a newer day.
     */
    @Override
    public int compareTo(Event thisEvent){
        if(this.getYear() - thisEvent.getYear() == 0 && 
        this.getMonth() - thisEvent.getMonth() == 0){
            return this.getDay() - thisEvent.getDay();
        }
        else if(this.getYear() - thisEvent.getYear() == 0){
            return this.getMonth() - thisEvent.getMonth();
        }
        else{
            return this.getYear() - thisEvent.getYear();
        }
    } // end method
} // end class
