
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author mosscluney
 */
/**
 * Represents a ride in an amusement park.
 */
public class Ride implements RideInterface {

    private String name;
    private Boolean isOperating;
    private Employee employeeOnShift;
    ArrayList<Visitor> queue = new ArrayList<>();
    LinkedList<Visitor> visitorHistory = new LinkedList<>();
    Iterator<Visitor> visitorHistoryIterator = visitorHistory.iterator();

    /**
     * Constructs a new Ride object.
     */
    public Ride() {
    }

    /**
     * Constructs a Ride object with the given name, operating status, and
     * employee on shift.
     *
     * @param name The name of the ride
     * @param isOperating The operating status of the ride
     * @param employeeOnShift The employee currently on shift for the ride
     */
    public Ride(String name, Boolean isOperating, Employee employeeOnShift) {
        this.name = name;
        this.isOperating = isOperating;
        this.employeeOnShift = employeeOnShift;
    }

    //GETTER and SETTERS
    /**
     * Returns the name associated with this object.
     *
     * @return The name of the object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the object.
     *
     * @param name The name to set
    *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the operating status of the entity.
     *
     * @param isOperating The operating status to set
     */
    public Boolean getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(Boolean isOperating) {
        this.isOperating = isOperating;
    }

    /**
     * Retrieves the employee currently on shift.
     *
     * @return The employee on shift.
     */
    public Employee getEmployeeOnShift() {
        return employeeOnShift;
    }

    /**
     * Sets the employee currently on shift.
     *
     * @param employeeOnShift The employee object representing the employee on
     * shift
     */
    public void setEmployeeOnShift(Employee employeeOnShift) {
        this.employeeOnShift = employeeOnShift;
    }

    //RideInterface Methods

    /**
     * Adds a visitor to the queue.
     *
     * @param visitor The visitor to be added to the queue
     */
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        this.queue.add(visitor);
        
    }

    @Override
    /**
     * Removes a visitor from the queue.
     *
     * @param visitor The visitor to be removed from the queue
     */
    public void removeVisitorFromQueue(Visitor visitor) {
        this.queue.remove(visitor);
    }

    @Override
    /**
     * Prints the queue for a specific entity.
     */
    public void printQueue() {
        System.out.println("Queue for " + this.name + ":\n");
        for (Visitor visitor : this.queue) {
            System.out.println("Queue Position #" + this.queue.indexOf(visitor) + "\n" + "Visitor Name:" + visitor.getName() + "\n");
        }
    }

    
    @Override
    /**
     * Adds a visitor to the history of visitors.
     *
     * @param visitor The visitor to add to the history
     */
    public void addVisitorToHistory(Visitor visitor) {
        this.visitorHistory.add(visitor);
    }

    @Override
    /**
     * Checks if a visitor is present in the visitor history of the ride.
     *
     * @param visitor The visitor to check for in the visitor history
     */
    public void checkVisitorFromHistory(Visitor visitor) {
        for (Object visitorObject : visitorHistory) {
            if (visitorObject == visitor) {
                System.out.println("Visitor " + visitor.getName() + " found in visitor history of ride " + this.getName());
                break;
            }
        }
    }

    @Override
    /**
     * Returns the number of visitors in the visitor history.
     *
     * @return The number of visitors in the visitor history.
     */
    public int numberOfVisitors() {
        return this.visitorHistory.size();
    }

    @Override
    /**
     * Prints the ride history for the current ride object. It iterates through
     * the visitor history and prints each visitor's name and ID.
     */
    public void printRideHistory() {
        System.out.println("Ride history for " + this.getName());
        while (visitorHistoryIterator.hasNext()) {
            System.out.println("Visitor: " + visitorHistoryIterator.next().getName() + " (" + visitorHistoryIterator.next().getID() + ")");
        }
    }

    @Override
    public void runOneCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
