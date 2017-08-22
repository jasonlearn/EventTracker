/**
 * Class Person
 * @author Jason Chan A00698160
 * @version Assignment 3
 * class Person takes firstName and lastName as a parameter
 * all variables are validated by their own standards
 * Has method toString to display the person as a String
 * Subclass of birthday
 * Has try, catch and throw to validate invalid inputs
 * Has method to get full name of Person
 */
public class Person implements Reportable{
    private String firstName; //will be validated that it is not empty
    private String lastName; //will be validated that it is not empty
    
    /**
     * Constructor for class Person
     * @param firstName set attribute for first name of Person
     * @param lastName set attribute for last name of Person
     * Constructor of Person class catches InvalidNameException when firstName or
     * lastName is equal to null or is empty.
     */
    public Person(String firstName, String lastName){
        try{
            this.setFirstName(firstName);
            this.setLastName(lastName);
        }
        catch(InvalidNameException e){
            System.out.println("InvalidNameException: " + e.getMessage());
        }
        finally{
            //do nothing
        }
        this.firstName = firstName;
        this.lastName = lastName;
    } //end constructor

    /**
     * Accessor Method
     * @return firstName value of Person
     */
    public String getFirstName() {
        return firstName; //returns firstName
    } //end accessor

    /**
     * Mutator Method
     * This method throws InvalidNameException when firstName is empty or equals to null.
     * @param firstName to set attribute for Person
     */
    public void setFirstName(String firstName) throws InvalidNameException{
        if((firstName != null && (!(firstName.isEmpty())))){
            this.firstName = firstName;
        }
        else{
            throw new InvalidNameException(firstName + " is an invalid first name");
        }
    } //end mutator

    /**
     * Accessor Method
     * @return lastName value of Person
     */
    public String getLastName() {
        return lastName; //returns lastName
    } //end accessor

    /**
     * Mutator Method
     * This method throws InvalidNameException when lastName is empty or equals to null.
     * @param lastName to set attribute of Person
     */
    public void setLastName(String lastName) throws InvalidNameException{
        if(lastName != null && (!(lastName.isEmpty()))){ //validates lastName is not empty
            this.lastName = lastName; 
        }
        else{
            throw new InvalidNameException(lastName + " is an invalid last name");
        }
    } //end mutator
    
    /**
     * Method to get person full name
     */
    public String getFullName(){
        return firstName + " " + lastName;
    } // end method
    
    @Override
    public void report(){
       System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
    }
} //end class
