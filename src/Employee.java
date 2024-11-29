/**
 *
 * @author mosscluney
 */
/**
 * Represents an Employee, extending the Person class with additional attributes.
 */
public class Employee extends Person {
    private int ID;
    private String name;
    private String DOB;
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
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.roleTitle = roleTitle;
        this.startDate = startDate;
    }

    /**
     * Retrieves the ID of the employee.
     *
     * @return The ID of the employee.
     */
    @Override
    public int getID() {
        return this.ID;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return The name of the employee.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name The name to set.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the date of birth of the employee.
     *
     * @return The date of birth.
     */
    @Override
    public String getDOB() {
        return this.DOB;
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
