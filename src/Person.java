
/**
 * Represents a person with an ID, name, and date of birth.
 */
public class Person {
    private int ID;
    private String name;
    private String DOB;
    
    // Primary constructor 
    public Person() {
    }

    /**
     * Constructs a new Person object with the specified ID, name, and date of birth.
     *
     * @param ID The unique identifier of the person
     * @param name The name of the person
     * @param DOB The date of birth of the person
     */
    public Person(int ID, String name, String DOB) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
    }

    /**
     * Retrieves the ID of the object.
     *
     * @return The ID of the object.
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Retrieves the name associated with this object.
     *
     * @return The name of the object.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the object.
     *
     * @param name The new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the date of birth (DOB) of the person.
     *
     * @return The date of birth in string format.
     */
    public String getDOB() {
        return this.DOB;
    }

    /**
     * Sets the Date of Birth (DOB) for a person.
     *
     * @param DOB The Date of Birth to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
