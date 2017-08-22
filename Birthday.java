/**
 * @author Jason Chan A00698160
 * @version Assignment 3
 * This class is a subclass of Date, but also has class Person as its field.
 * class Birthday takes date and person as a parameter
 * all variables are validated by their own standards
 * Has method toString to display the birthday and date as a String
 * Has method to compare two events to compare which is bigger, newer dates are bigger
 * Subclass of Dates which has an ArrayList of Birthday
 */
public final class Birthday extends Date implements Comparable<Birthday>{
    
    protected Person person;

    /**
     * Constructor to initialize Birthday
     * @param day to set attribute for day of class Birthday
     * @param month to set attribute for month of class Birthday
     * @param year to set attribute for year of class Birthday
     * @param person to set attribute of person
     */
    public Birthday(int year, int month, int day, Person person) {
        super(year, month, day);
        this.person = person;
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
     * Accessor Method
     * @return person attribute
     */
    public Person getPerson() {
        return person;
    } //end accessor

    /**
     * Mutator Method
     * @param person to set value of person
     */
    public void setPerson(Person person) {
        if(person != null){
            this.person = person;
        }
    } //end mutator
    
    /**
     * Method to return Birthday as a String
     * @return event as a String
     */
    public String toString(){
        return Date.MONTH_OF_INDEX[getMonth() - JANUARY] + " " + getDay() + " " + getYear() + 
               " is " + person.getFullName() + "'s birthday.";
    } // end method

    /**
     * Method to compare two events dates.
     * @param thisEvent to compare with this event.
     * @return + if (this event is bigger) if it is a newer day.
     */
    @Override
    public int compareTo(Birthday thisBirthday){
        if(this.getYear() - thisBirthday.getYear() == 0 && 
           this.getMonth() - thisBirthday.getMonth() == 0){
            return this.getDay() - thisBirthday.getDay();
        }
        else if(this.getYear() - thisBirthday.getYear() == 0){
            return this.getMonth() - thisBirthday.getMonth();
        }
        else{
            return this.getYear() - thisBirthday.getYear();
        }
    } // end method
} //end class
