/**
 *
 * @author mosscluney
 */
/**
 * Represents an Employee, extending the Person class with additional attributes.
 */
public class Visitor extends Person {
    private boolean VIP;
    private String ticketExpiry;
    
    /**
     * Default constructor for the Visitor class.
     */
    public Visitor() {
    }

    /**
     * Constructs a Visitor object with the specified attributes.
     *
     * @param ID The ID of the visitor
     * @param name The name of the visitor
     * @param DOB The date of birth of the visitor
     * @param VIP A boolean indicating if the visitor is a VIP
     * @param ticketExpiry The expiry date of the visitor's ticket
     */
    public Visitor(int ID, String name, String DOB, boolean VIP, String ticketExpiry) {
        super(ID, name, DOB);
        this.VIP = VIP;
        this.ticketExpiry = ticketExpiry;
    }

    /**
     * Checks if the user is a VIP.
     *
     * @return true if the user is a VIP, false otherwise
     */
    public boolean isVIP() {
        return VIP;
    }

    /**
     * Sets the VIP status of a player.
     *
     * @param VIP true if the player is a VIP, false otherwise
     */
    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    /**
     * Retrieves the ticket expiry date and time.
     *
     * @return The ticket expiry date and time as a String.
     */
    public String getTicketExpiry() {
        return ticketExpiry;
    }

    /**
     * Sets the expiry date and time for a ticket.
     *
     * @param ticketExpiry The expiry date and time for the ticket
     */
    public void setTicketExpiry(String ticketExpiry) {
        this.ticketExpiry = ticketExpiry;
    }
}
