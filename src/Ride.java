
import java.util.ArrayList;

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
    private ArrayList<Visitor> queue = new ArrayList<>();
     
    
        /**
         * Constructs a new Ride object.
         */
        public Ride() {
        }
    
        public Ride(String name, Boolean isOperating, Employee employeeOnShift, ArrayList<Visitor> queue) {
            this.name = name;
            this.isOperating = isOperating;
            this.employeeOnShift = employeeOnShift;
            this.queue = queue;
    }


    //GETTER and SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(Boolean isOperating) {
        this.isOperating = isOperating;
    }

    public Employee getEmployeeOnShift() {
        return employeeOnShift;
    }

    public void setEmployeeOnShift(Employee employeeOnShift) {
        this.employeeOnShift = employeeOnShift;
    }


    //RideInterface Methods


    @Override
    public void addVisitorToQueue(Visitor visitor) {
        this.queue.add(visitor);
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        this.queue.remove(visitor);
    }

    @Override
    public void printQueue() {
        System.out.println("Queue for " + this.name + ":\n");
        for (Visitor visitor: this.queue) {
            System.out.println("Queue Position #"+this.queue.indexOf(visitor)+"\n"+"Visitor Name:"+visitor.getName()+"\n");
        }
    }

    @Override
    public void runOneCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numberOfVisitors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printRideHistory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    

}
