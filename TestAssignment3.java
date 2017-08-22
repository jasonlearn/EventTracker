import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * The test class TestAssignment3.
 * to test all constructors and methods twice.
 * @author  Jason Chan A00698160
 * @version Assignment 3
 */
public class TestAssignment3
{
    private Person testPerson;
    private Event testEvent;
    private Birthday testBirthday;

    /**
     * Sets up the test fixture for class Person.
     * Called before every test case method.
     * to test constructor for class Person.
     */
    @Before
    public void setUpTestPerson1()
    {
        testPerson = new Person("Alan", "Turing");
    } //end setup

    /**
     * To test accessor method getFirstName in class Person
     */
    @Test
    public void testPersonGetFirstName1(){
        assertEquals(testPerson.getFirstName(), "Alan");
    } //end accessor method test

    /**
     * To test accessor method getLastName in class Person
     */
    @Test
    public void testPersonGetLastName1(){
        assertEquals(testPerson.getLastName(), "Turing");
    } //end accessor method test

    /**
     * To test accessor method getFulName in class Person
     */
    @Test
    public void testPersonGetFullName1()
    {
        assertEquals(testPerson.getFullName(), "Alan Turing");
    }

    /**
     * To test mutator method setFirstName in class Person
     */
    @Test
    public void testPersonSetFirstName1(){
        try{
            testPerson.setFirstName("Alan");
            assert true;
        }
        catch (InvalidNameException e) {
            assert false;
        }
        assertEquals(testPerson.getFirstName(), "Alan");
    } //end mutator method test

    /**
     * To test mutator method setLastName in class Person
     */
    @Test
    public void testPersonSetLastName1(){
        try{
            testPerson.setLastName("Turing");
            assert true;
        }
        catch (InvalidNameException e) {
            assert false;
        }
        assertEquals(testPerson.getLastName(), "Turing");
    } //end mutator method test

    /**
     * To test reportable class
     * *** I couldn't get this to work!!! ***
     * *** any solutions?
     */
    @Test
    public void testReportable(){
        Person a = new Person("Alan" , "Turing");
        a.report();
        assertEquals("ALAN TURING", a.toString());
    } //end report test

    /**
     * To test abstract method report() implemented from reportable class
     * *** I couldn't get this to work!!! ***
     * *** any solutions?
     */
    @Test
    public void testPersonReport1(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream target = new PrintStream(out);
        Reportable a = new Person("Alan" , "Turing");
        a.report();
        String result = out.toString();
        assertEquals("ALAN TURING", result.toString());
    } //end report test

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     * set testPerson to null
     */
    @After
    public void tearDownTestPerson1()
    {
        testPerson = null;
    } //end teardown

    @Test
    public void testPersonGetFirstName2()
    {
        try{
            testPerson.setFirstName(null);
            fail();
        }catch(InvalidNameException e){
            assertEquals(e.getMessage(), "null is an invalid first name");
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void testPersonGetLastName2()
    {
        try{
            testPerson.setLastName(null);
            fail();
        }catch(InvalidNameException e){
            assertEquals(e.getMessage(), "null is an invalid last name");
        }catch(Exception e){
            fail();
        }
    }

    /**
     * Sets up the test fixture for class Person.
     * Called before every test case method.
     * to test constructor for class Person.
     */
    @Test
    public void setUpTestPerson2()
    {
        try{
            testPerson.setFirstName("Stephen");
            testPerson.setLastName("Hawking");
        }catch(Exception e){
            fail();
        }
    } //end setup

    /**
     * To test accessor method getFullName in class Person
     */
    @Test
    public void testPersonGetFullName2(){
        try{
            testPerson.setFirstName("Stephen");
            testPerson.setLastName("Hawking");
        }catch(Exception e){
            fail();
        }
        assertEquals(testPerson.getFullName(), "Stephen Hawking");
    } //end mutator method test

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @After
    public void tearDownTestPerson2()
    {
        testPerson = null;
    } //end teardown
    // END TEST PERSON

    // TEST EVENT
    /**
     * Sets up the test fixture for class Event.
     * Called before every test case method.
     * to test constructor for class Event.
     */
    @Test
    public void setUpTestEvent1()
    {
        testEvent = new Event(2012, 1, 1, "holiday");
    } //end setup

    /**
     * To test accessor method getDay in class Date
     */
    @Test
    public void testEventGetDay1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals(testEvent.getDay(), 1);
    } //end accessor method test

    /**
     * To test accessor method getMonth in class Date
     */
    @Test
    public void testEventGetMonth1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals(testEvent.getMonth(), 1);
    } //end accessor method test

    /**
     * To test accessor method getYear in class Date
     */
    @Test
    public void testEventGetYear1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals(testEvent.getYear(), 2012);
    } //end accessor method test

    /**
     * To test accessor method getTheEventNameString in class Event
     */
    @Test
    public void testEventGetEventString1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals(testEvent.getTheEventNameString(), "holiday");
    } //end accessor method test

    /**
     * To test mutator method getEventName in class Event
     */
    @Test
    public void testEventGetEvent1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals(testEvent.getEventName(), EventName.HOLIDAY);
    } //end accessor method test

    /**
     * To test mutator method setEvent in class Event
     */
    @Test
    public void testEventSetEvent1(){
        Event testEvent = new Event(2012, 6, 1, "other");
        testEvent.setEventName(EventName.OTHER);
        assertEquals(testEvent.getEventName().toString(), "OTHER");
    } //end mutator method test

    /**
     * To test toString method in class Event
     */
    @Test
    public void testEventToString1(){
        testEvent = new Event(2012, 1, 1, "holiday");
        assertEquals("January 1 2012 is holiday", testEvent.toString());
    } //end toString method test

    /**
     * To test compareTo method in class Event
     */
    @Test
    public void testEventCompareTo1(){
        Event firstEvent = new Event(2011, 31, 12, "holiday");
        Event secondEvent = new Event(2011, 30, 1, "other");
        assertEquals(1, firstEvent.compareTo(secondEvent));
    } // end compreTo test

    /**
     * To tear down testEvent
     */
    public void testEventTearDown(){
        testEvent = null;
    } //end tear down

    /**
     * Sets up the test fixture for class Event.
     * Called before every test case method.
     * to test constructor for class Event.
     */
    @Test
    public void setUpTestEvent2()
    {
        testEvent = new Event(2010, 7, 1, "holiday");
    } //end setup

    /**
     * To test accessor method getDay in class Date
     */
    @Test
    public void testEventGetDay2(){
        testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals(testEvent.getDay(), 1);
    } //end accessor method test

    /**
     * To test accessor method getMonth in class Date
     */
    @Test
    public void testEventGetMonth2(){
        testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals(testEvent.getMonth(), 7);
    } //end accessor method test

    /**
     * To test accessor method getYear in class Date
     */
    @Test
    public void testEventGetYear2(){
        testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals(testEvent.getYear(), 2010);
    } //end accessor method test

    /**
     * To test accessor method getTheEventNameString in class Event
     */
    @Test
    public void testEventGetEventString2(){
        testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals(testEvent.getTheEventNameString(), "holiday");
    } //end accessor method test

    /**
     * To test mutator method getEventName in class Event
     */
    @Test
    public void testEventGetEvent2(){
        testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals(testEvent.getEventName(), EventName.HOLIDAY);
    } //end accessor method test

    /**
     * To test mutator method setEvent in class Event
     */
    @Test
    public void testEventSetEvent2(){
        Event testEvent = new Event(2010, 7, 1, "holiday");
        testEvent.setEventName(EventName.HOLIDAY);
        assertEquals(testEvent.getEventName().toString(), "HOLIDAY");
    } //end mutator method test

    /**
     * To test toString method in class Event
     */
    @Test
    public void testToString2(){
        Event testEvent = new Event(2010, 7, 1, "holiday");
        assertEquals("July 1 2010 is holiday", testEvent.toString());
    } //end toString method test

    /**
     * To test compareTo method in class Event
     */
    @Test
    public void testCompareTo2(){
        Event firstEvent = new Event(2009, 25, 10, "holiday");
        Event secondEvent = new Event(2009, 24, 10, "other");
        assertEquals(1, firstEvent.compareTo(secondEvent));
    } // end compreTo test
    
    /**
     * To tear down testEvent
     */
    @After
    public void tearDownTestEvent2(){
        testEvent = null;
    } // end tear down method
    // END TEST EVENT
    
    // TEST BIRTHDAY
    /**
     * To set up class Birthday
     */
    @Test
    public void setUpTestBirthday1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
    } //end setup testBirthday
    
    /**
     * To test accessor method getYear for class Birthday
     */
    @Test
    public void testBirthdayGetYear1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        assertEquals(testBirthday.getYear(), 1643);
    } //end accessor getYear test
    
    /**
     * To test accessor method getMonth for class Birthday
     */
    @Test
    public void testBirthdayGetMonth1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        assertEquals(testBirthday.getMonth(), 1);
    } //end accessor getMonth test
    
    /**
     * To test accessor method getDay for class Birthday
     */
    @Test
    public void testBirthdayGetDay1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        assertEquals(testBirthday.getDay(), 4);
    } //end accessor getDay test
    
    /**
     * To test accessor method getPerson for class Birthday
     */
    @Test
    public void tesBirthdayGetPerson1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        assertEquals(testBirthday.person.getFullName(), "Issac Newton");
    } //end accessor getPerson test
    
    /**
     * To test accessor method toString for class Birthday
     */
    @Test
    public void testBirthdayToString1(){
        testBirthday = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        assertEquals(testBirthday.toString(), "January 4 1643 is Issac Newton's birthday.");
    } //end accessor toString test
    
    /**
     * To test comparTo method in class Birthday
     */
    @Test
    public void testBirthdayCompareTo1(){
        Birthday testBirthday1 = new Birthday(1643, 1, 4, new Person("Issac", "Newton"));
        Birthday testBirthday2 = new Birthday(1643, 1, 1, new Person("Not Issac", "Newton"));
        assertEquals(testBirthday1.compareTo(testBirthday2), 3);
    } //end compareTo test
    
    /**
     * To tear down testBirthday
     */
    @After
    public void testBirthdayTearDown1(){
        testBirthday = null;
    } //end tear down
    
    /**
     * To set up class Birthday
     */
    @Test
    public void setUpTestBirthday2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
    } //end setup testBirthday
    
    /**
     * To test accessor method getYear for class Birthday
     */
    @Test
    public void testBirthdayGetYear2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        assertEquals(testBirthday.getYear(), 1912);
    } //end accessor getYear test
    
    /**
     * To test accessor method getMonth for class Birthday
     */
    @Test
    public void testBirthdayGetMonth2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        assertEquals(testBirthday.getMonth(), 6);
    } //end accessor getMonth test
    
    /**
     * To test accessor method getDay for class Birthday
     */
    @Test
    public void testBirthdayGetDay2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        assertEquals(testBirthday.getDay(), 23);
    } //end accessor getDay test
    
    /**
     * To test accessor method getPerson for class Birthday
     */
    @Test
    public void tesBirthdayGetPerson2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        assertEquals(testBirthday.person.getFullName(), "Alan Turing");
    } //end accessor getPerson test
    
    /**
     * To test accessor method toString for class Birthday
     */
    @Test
    public void testBirthdayToString2(){
        testBirthday = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        assertEquals(testBirthday.toString(), "June 23 1912 is Alan Turing's birthday.");
    } //end accessor toString test
    
    /**
     * To test comparTo method in class Birthday
     */
    @Test
    public void testBirthdayCompareTo2(){
        Birthday testBirthday1 = new Birthday(1912, 6, 23, new Person("Alan", "Turing"));
        Birthday testBirthday2 = new Birthday(1643, 5, 23, new Person("Not Alan", "Turing"));
        assertEquals(testBirthday1.compareTo(testBirthday2), 269);
    } //end compareTo test
    
    /**
     * To tear down testBirthday
     */
    @After
    public void testBirthdayTearDown2(){
        testBirthday = null;
    } //end tear down
    //END BIRTHDAY TEST
} //end class TestAssignment3 
