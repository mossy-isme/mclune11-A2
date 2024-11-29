
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mosscluney
 */
/**
 * Represents a ride in an amusement park.
 */
public class Ride implements RideInterface {

    private int maxRider;
    int numOfCycles = 0;
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
     * Constructs a Ride object with the specified parameters.
     *
     * @param maxRider The maximum number of riders allowed on the ride
     * @param numOfCycles The number of cycles the ride has completed
     * @param name The name of the ride
     * @param isOperating The status of the ride (operating or not)
     * @param employeeOnShift The employee currently assigned to the ride
     * @param queue The queue of visitors waiting to ride
     * @param visitorHistory The history of visitors who have ridden the ride
     */
    public Ride(int maxRider, String name, Boolean isOperating, Employee employeeOnShift) {
        if (maxRider >= 1) {
            this.maxRider = maxRider;
            this.name = name;
            this.isOperating = isOperating;
            this.employeeOnShift = employeeOnShift;
            System.err.println("Success: Ride successfully created.");
        } else {
            System.err.println("Error: Failed to create ride, maxRider is less than 1.");
        }
    }

    //GETTER and SETTERS
    /**
     * Retrieves the maximum number of riders allowed.
     *
     * @return The maximum number of riders allowed.
     */
    public int getMaxRider() {
        return maxRider;
    }

    /**
     * Sets the maximum number of riders allowed on a vehicle.
     *
     * @param maxRider The maximum number of riders allowed
     */
    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    /**
     * Returns the number of cycles.
     *
     * @return The number of cycles.
     */
    public int getNumOfCycles() {
        return numOfCycles;
    }

    /**
     * Sets the number of cycles for a specific operation.
     *
     * @param numOfCycles The number of cycles to set
     */
    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

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

    /**
     * Sorts the visitor history list using a custom VisitorComparator. If the
     * visitor history list is empty or null, a message is printed and the
     * method returns.
     */
    public void sortVisitorHistory() {
        if (visitorHistory == null || visitorHistory.isEmpty()) {
            System.out.println("Info: No visitors to sort in the history.");
            return;
        }

        Collections.sort(visitorHistory, new VisitorComparator());
        System.out.println("Visitor history sorted successfully.");
    }

    /**
     * Runs one cycle of the ride, processing visitors from the queue.
     * Checks if the ride is operating, an employee is on shift, and the queue is not empty before starting the cycle.
     * If conditions are met, processes visitors from the queue up to the maximum rider capacity.
     * Updates the number of cycles and logs the success message with the number of visitors processed.
     */
    @Override
    public void runOneCycle() {
        // Check if the ride is operating or if an employee is on shift
        if (!this.isOperating) {
            System.out.println("Error: The ride is not currently operating. Please ensure the ride is operational before starting a cycle.");
            return; // Exit the method to prevent further processing
        }
        if (this.employeeOnShift == null) {
            System.out.println("Error: No employee is on shift to operate the ride. Assign an employee before starting a cycle.");
            return; // Exit the method
        }

        // Check if the queue is empty
        if (this.queue.isEmpty()) {
            System.out.println("Error: The ride queue is empty. Add visitors to the queue before starting a cycle.");
            return; // Exit the method
        }

        // Process the queue
        int processedRiders = 0;
        for (int i = 0; i < maxRider && !this.queue.isEmpty(); i++) {
            Visitor queuedVisitor = this.queue.get(0); // Always get the first visitor
            this.visitorHistory.add(queuedVisitor);
            this.queue.remove(0); // Remove the first visitor
            processedRiders++;
        }

        this.numOfCycles++;
        System.out.println("Success: Cycle completed successfully. " + processedRiders + " visitors enjoyed the ride.");
    }

    /**
     * Exports the ride history of visitors to a CSV file named "rideHistory.csv".
     * The file will contain visitor details such as ID, name, date of birth, VIP status, and ticket expiry.
     * If the file does not exist, it will be created.
     * Any IOException that occurs during the file writing process will be caught and printed to the console.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public void exportRideHistory() {
        try {
            File rideHistoryFile = new File("rideHistory.csv");
            if (rideHistoryFile.createNewFile()) {
                System.out.println("Success: File created:" + rideHistoryFile.getName());
            } 
            FileWriter rideHistoryWriter = new FileWriter("rideHistory.csv");
            for (Visitor visitor: visitorHistory) {
                rideHistoryWriter.write(visitor.getID()+","+visitor.getName()+","+visitor.getDOB()+","+visitor.isVIP()+","+visitor.getTicketExpiry()+"\n");
            }
            rideHistoryWriter.close();
            System.out.println("Success: Vistor history wrote to file.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public void importRideHistory() {
        try {
            File rideHistoryFile = new File("rideHistory.csv");
            Scanner rideHistoryScanner = new Scanner(rideHistoryFile);
            while (rideHistoryScanner.hasNextLine()) {
                String data = rideHistoryScanner.nextLine();
                this.addVisitorToHistory(new Visitor(data.split(",")[0],data.split(",")[1],Boolean.parseBoolean(data.split(",")[2]),data.split(",")[3]));
            }
            rideHistoryScanner.close();
            System.out.println("Success: Vistor history wrote to file.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

}
