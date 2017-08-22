import java.util.ArrayList;
import java.util.Collections;

/**
 * This is class Dates
 * sets up an ArrayList which consists of 3 Events objects, 1 null, and 3 Birthday objects
 * This class also has a method to display all objects of the ArrayList.
 * 
 * @author Jason Chan A00698160
 * class Dates has an ArrayList of Date objects
 */
public class Dates {
    private ArrayList<Event> eventsArrayList;
    private ArrayList<Birthday> birthdaysArrayList;

    /**
     * Constructor
     */
    public Dates(){
        eventsArrayList = new ArrayList<Event>();
        eventsArrayList.add(new Event(2011, 7, 1, "holiday")); // canada day
        eventsArrayList.add(new Event(2010, 4, 5, "holiday")); // easter holiday
        eventsArrayList.add(new Event(2012, 1, 1, "holiday")); // new years

        birthdaysArrayList = new ArrayList<Birthday>();
        birthdaysArrayList.add(new Birthday(1643, 1, 4, new Person("Issac", "Newton"))); // Issac Newton birthday
        birthdaysArrayList.add(new Birthday(1912, 6, 23, new Person("Alan", "Turing"))); // Alan Turing birthday
        birthdaysArrayList.add(new Birthday(1942, 1, 8, new Person("Stephen", "Hawking"))); // Stephen Hawking birthday
    } // end constructor

    /**
     * To display all objects of dates
     * forLoop to display all objects as String
     */
    public void displayDates(){
        System.out.println("List of Dates before sorting");
        for(Event e : eventsArrayList){
            if(!(e instanceof Event)){
                System.out.println();
            }
            else{
                System.out.println(e);
            }
        }

        for(Birthday b : birthdaysArrayList){
            if(!(b instanceof Birthday)){
                System.out.println();
            }

            else{
                System.out.println(b);
            }
        }
    }
    
    /**
     * To sort and display all Dates - newer dates are bigger
     */
    public void displaySortedDates(){
        Collections.sort(eventsArrayList);
        Collections.sort(birthdaysArrayList);
        System.out.println();
        System.out.println("List of Dates after sorting - newer date is bigger");

        for(Event e : eventsArrayList){
            if(!(e instanceof Event)){
                System.out.println();
            }
            else{
                System.out.println(e);
            }
        }

        for(Birthday b : birthdaysArrayList){
            if(!(b instanceof Birthday)){
                System.out.println();
            }
            else{
                System.out.println(b);
            }
        }
    }
}
