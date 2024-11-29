/**
 *
 * @author mosscluney
 */
/**
 * Represents an Employee, extending the Person class with additional attributes.
 */
public class Employee extends Person {
    private String roleTitle;
    private String startDate;
    
    /**
     * Default constructor for the Employee class.
     */
    public Employee() {
    }
    
    /**
     * Constructs an Employee object with the specified attributes.
     *
     * @param ID The ID of the employee
     * @param name The name of the employee
     * @param DOB The date of birth of the employee
     * @param roleTitle The title of the role of the employee
     * @param startDate The start date of the employee
     */
    public Employee(int ID, String name, String DOB, String roleTitle, String startDate) {
        super(ID, name, DOB);
        this.roleTitle = roleTitle;
        this.startDate = startDate;
    }

    /**
     * Retrieves the title of the role.
     *
     * @return The title of the role.
     */
    public String getRoleTitle() {
        return roleTitle;
    }

    /**
     * Sets the title of the role.
     *
     * @param roleTitle The title of the role to be set
     */
    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    /**
     * Retrieves the start date of an event.
     *
     * @return The start date of the event.
     */
    public String getStartDate() {
        return startDate;
    }
}
