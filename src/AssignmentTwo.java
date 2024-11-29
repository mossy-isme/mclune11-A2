/**
 *
 * @author mosscluney
 */
public class AssignmentTwo {
    
    public void partThree(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride("The Wizard Of Oz", true, rideOperatorOne);

        Visitor visitorOne = new Visitor("George", "2/5/1989", false, "25/12/2025");
        Visitor visitorTwo = new Visitor("Bill", "2/2/1969", false, "5/10/2026");
        Visitor visitorThree = new Visitor("Liam", "23/8/2002", true, "2/1/2026");
        Visitor visitorFour = new Visitor("Briah", "21/12/2000", false, "22/11/2025");
        Visitor visitorFive = new Visitor("Greg", "20/12/2006", true, "2/12/2024");
        
        Object[] visitors = {visitorOne, visitorTwo, visitorThree, visitorFour, visitorFive};

        for (Object i: visitors) {
            theWizardOfOz.addVisitorToQueue((Visitor) i);
        }

        theWizardOfOz.printQueue();

        theWizardOfOz.removeVisitorFromQueue(visitorTwo);

        theWizardOfOz.printQueue();

        
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
    }
    
}
