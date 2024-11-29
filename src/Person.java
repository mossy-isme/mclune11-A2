/**
 *
 * @author mosscluney
 */
/**
 * Represents a person with an ID, name, and date of birth.
 */
abstract  class Person {
    public abstract int getID();
    
    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getDOB();
}
