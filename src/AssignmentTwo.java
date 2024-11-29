/**
 *
 * @author mosscluney
 */
public class AssignmentTwo {
    
    public void partThree(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

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
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

        Visitor visitorOne = new Visitor("George", "2/5/1989", false, "25/12/2025");
        Visitor visitorTwo = new Visitor("Bill", "2/2/1969", false, "5/10/2026");
        Visitor visitorThree = new Visitor("Liam", "23/8/2002", true, "2/1/2026");
        Visitor visitorFour = new Visitor("Briah", "21/12/2000", false, "22/11/2025");
        Visitor visitorFive = new Visitor("Greg", "20/12/2006", true, "2/12/2024");
        
        Object[] visitors = {visitorOne, visitorTwo, visitorThree, visitorFour, visitorFive};

        for (Object i: visitors) {
            theWizardOfOz.addVisitorToHistory((Visitor) i);
        }

        theWizardOfOz.checkVisitorFromHistory(visitorTwo);

        theWizardOfOz.numberOfVisitors();

        theWizardOfOz.printRideHistory();

        
    }
    public void partFourB(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

        Visitor visitorOne = new Visitor("George", "2/5/1989", false, "25/12/2025");
        Visitor visitorTwo = new Visitor("Bill", "2/2/1969", false, "5/10/2026");
        Visitor visitorThree = new Visitor("Liam", "23/8/2002", true, "2/1/2026");
        Visitor visitorFour = new Visitor("Briah", "21/12/2000", false, "22/11/2025");
        Visitor visitorFive = new Visitor("Greg", "20/12/2006", true, "2/12/2024");
        
        Object[] visitors = {visitorOne, visitorTwo, visitorThree, visitorFour, visitorFive};

        for (Object i: visitors) {
            theWizardOfOz.addVisitorToHistory((Visitor) i);
        }

        theWizardOfOz.printRideHistory();

        theWizardOfOz.sortVisitorHistory();

        theWizardOfOz.printRideHistory();
    }
    public void partFive(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

        Visitor visitorOne = new Visitor("George", "2/5/1989", false, "25/12/2025");
        Visitor visitorTwo = new Visitor("Bill", "2/2/1969", false, "5/10/2026");
        Visitor visitorThree = new Visitor("Liam", "23/8/2002", true, "2/1/2026");
        Visitor visitorFour = new Visitor("Briah", "21/12/2000", false, "22/11/2025");
        Visitor visitorFive = new Visitor("Greg", "20/12/2006", true, "2/12/2024");
        Visitor visitorSix = new Visitor("Sophie", "14/3/1995", true, "15/7/2026");
        Visitor visitorSeven = new Visitor("Hannah", "8/11/1987", false, "10/8/2025");
        Visitor visitorEight = new Visitor("Ethan", "3/4/2010", true, "18/9/2026");
        Visitor visitorNine = new Visitor("Charlotte", "16/6/2001", false, "30/12/2025");
        Visitor visitorTen = new Visitor("Oscar", "25/9/1999", true, "1/6/2026");

        
        Object[] visitors = {visitorOne, visitorTwo, visitorThree, visitorFour, visitorFive, visitorSix, visitorSeven, visitorEight, visitorNine, visitorTen};

        for (Object i: visitors) {
            theWizardOfOz.addVisitorToQueue((Visitor) i);
        }

        theWizardOfOz.printQueue();

        theWizardOfOz.runOneCycle();

        theWizardOfOz.printQueue();

        theWizardOfOz.printRideHistory();
    }
    public void partSix(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

        Visitor visitorOne = new Visitor("George", "2/5/1989", false, "25/12/2025");
        Visitor visitorTwo = new Visitor("Bill", "2/2/1969", false, "5/10/2026");
        Visitor visitorThree = new Visitor("Liam", "23/8/2002", true, "2/1/2026");
        Visitor visitorFour = new Visitor("Briah", "21/12/2000", false, "22/11/2025");
        Visitor visitorFive = new Visitor("Greg", "20/12/2006", true, "2/12/2024");
        Visitor visitorSix = new Visitor("Sophie", "14/3/1995", true, "15/7/2026");
        Visitor visitorSeven = new Visitor("Hannah", "8/11/1987", false, "10/8/2025");
        Visitor visitorEight = new Visitor("Ethan", "3/4/2010", true, "18/9/2026");
        Visitor visitorNine = new Visitor("Charlotte", "16/6/2001", false, "30/12/2025");
        Visitor visitorTen = new Visitor("Oscar", "25/9/1999", true, "1/6/2026");

        
        Object[] visitors = {visitorOne, visitorTwo, visitorThree, visitorFour, visitorFive, visitorSix, visitorSeven, visitorEight, visitorNine, visitorTen};

        for (Object i: visitors) {
            theWizardOfOz.addVisitorToQueue((Visitor) i);
        }

        theWizardOfOz.runOneCycle();

        theWizardOfOz.exportRideHistory();
    }
    public void partSeven(){
        Employee rideOperatorOne = new Employee("John Geoffery","19/11/1999","Ride Operator", "3/5/2012");
        
        Ride theWizardOfOz = new Ride(4, "The Wizard Of Oz", true, rideOperatorOne);

        theWizardOfOz.importRideHistory();

        theWizardOfOz.numberOfVisitors();

        theWizardOfOz.printRideHistory();
    }

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
        //assignmentTwo.partFourA();
        //assignmentTwo.partFourB();
        //assignmentTwo.partFive();
        //assignmentTwo.partSix();
        //assignmentTwo.partSeven();
    }
    
}
