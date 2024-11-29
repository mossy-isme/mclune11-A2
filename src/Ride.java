
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
        if (visitor == null) {
            System.err.println("Error: Cannot add a null visitor to the queue.");
            return;
        }
        boolean addedSuccessfully = this.queue.add(visitor);

        if (addedSuccessfully) {
            System.out.println("Success: Visitor added to the queue.");
        } else {
            System.err.println("Error: Failed to add the visitor to the queue.");
        }
    }

    /**
     * Removes a visitor from the queue.
     *
     * @param visitor The visitor to be removed from the queue
     */
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor == null) {
            System.err.println("Error: Cannot remove a null visitor from the queue.");
            return;
        }

        if (this.queue.contains(visitor)) {
            boolean removedSuccessfully = this.queue.remove(visitor);
            if (removedSuccessfully) {
                System.out.println("Success: Visitor removed from the queue.");
            } else {
                System.err.println("Error: An unexpected issue occurred while removing the visitor.");
            }
        } else {
            System.err.println("Error: The specified visitor is not in the queue.");
        }
    }

    /**
     * Prints the queue for a specific entity.
     */
    @Override
    public void printQueue() {
        if (this.queue == null || this.queue.isEmpty()) {
            System.out.println("The queue for " + this.name + " is currently empty.");
            return;
        }

        System.out.println("Queue for " + this.name + ":");
        int position = 1;
        for (Visitor visitor : this.queue) {
            if (visitor != null) {
                System.out.println("Queue Position #" + position + ": Visitor Name: " + visitor.getName());
            } else {
                System.err.println("Warning: Found a null entry in the queue at position #" + position);
            }
            position++;
        }
        System.out.println("\nQueue printing completed successfully.");
    }

    /**
     * Adds a visitor to the history of visitors.
     *
     * @param visitor The visitor to add to the history
     */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.err.println("Error: Cannot add a null visitor to the history.");
            return;
        }

        boolean addedSuccessfully = this.visitorHistory.add(visitor);

        if (addedSuccessfully) {
            System.out.println("Success: Visitor added to the history.");
        } else {
            System.err.println("Error: Failed to add the visitor to the history.");
        }
    }

    /**
     * Checks if a visitor is present in the visitor history of the ride.
     *
     * @param visitor The visitor to check for in the visitor history
     */
    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.err.println("Error: Cannot check a null visitor in the history.");
            return;
        }

        boolean found = false;

        for (Object visitorObject : visitorHistory) {
            if (visitorObject == visitor) {
                System.out.println("Success: Visitor " + visitor.getName() + " found in the visitor history of ride " + this.getName() + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Info: Visitor " + visitor.getName() + " not found in the visitor history of ride " + this.getName() + ".");
        }
    }

    /**
     * Returns the number of visitors in the visitor history.
     *
     * @return The number of visitors in the visitor history.
     */
    @Override
    public int numberOfVisitors() {
        if (this.visitorHistory == null) {
            System.err.println("Error: Visitor history is not initialized.");
            return 0;
        }

        int count = this.visitorHistory.size();

        if (count == 0) {
            System.out.println("Info: Visitor history is currently empty.");
        } else {
            System.out.println("Success: There are " + count + " visitors in the history.");
        }

        return count;
    }

    /**
     * Prints the ride history for the current ride object. It iterates through
     * the visitor history and prints each visitor's name and ID.
     */
    @Override
    public void printRideHistory() {
        if (visitorHistory == null || visitorHistory.isEmpty()) {
            System.out.println("Info: No ride history available for " + this.getName() + ".");
            return;
        }

        System.out.println("Ride history for " + this.getName() + ":");

        // Using a fresh iterator each time to avoid issues
        Iterator<Visitor> visitorHistoryIterator = visitorHistory.iterator();

        while (visitorHistoryIterator.hasNext()) {
            Visitor visitor = visitorHistoryIterator.next();
            if (visitor != null) {
                System.out.println("Visitor: " + visitor.getName() + " (ID: " + visitor.getID() + ")");
            } else {
                System.err.println("Warning: Encountered a null entry in the visitor history.");
            }
        }

        System.out.println("\nRide history printed successfully.");
    }

    @Override
    public void runOneCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
