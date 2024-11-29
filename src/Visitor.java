
/**
 *
 * @author mosscluney
 */

import java.util.UUID;

/**
 * Represents a visitor, extending the abstract Person class with additional VIP
 * status and ticket expiry information.
 */
public class Visitor extends Person {

    UUID ID;
    private String name;
    private String DOB;
    private boolean isVIP;
    private String ticketExpiry;

    /**
     * Default constructor for the Visitor class.
     */
    public Visitor() {
    }

    /**
     * Constructs a Visitor object with the specified attributes.
     *
     * @param ID The ID of the visitor.
     * @param name The name of the visitor.
     * @param DOB The date of birth of the visitor.
     * @param isVIP A boolean indicating if the visitor is a VIP.
     * @param ticketExpiry The expiry date of the visitor's ticket.
     */
    public Visitor(String name, String DOB, boolean isVIP, String ticketExpiry) {
        this.name = name;
        this.DOB = DOB;
        this.isVIP = isVIP;
        this.ticketExpiry = ticketExpiry;
    }

    /**
     * Retrieves the ID of the visitor.
     *
     * @return The ID of the visitor.
     */
    @Override
    public UUID getID() {
        return this.ID;
    }

    /**
     * Retrieves the name of the visitor.
     *
     * @return The name of the visitor.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the visitor.
     *
     * @param name The name to set.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the date of birth of the visitor.
     *
     * @return The date of birth.
     */
    @Override
    public String getDOB() {
        return this.DOB;
    }

    /**
     * Checks if the visitor is a VIP.
     *
     * @return true if the visitor is a VIP, false otherwise.
     */
    public boolean isVIP() {
        return isVIP;
    }

    /**
     * Sets the VIP status of the visitor.
     *
     * @param isVIP true if the visitor is a VIP, false otherwise.
     */
    public void setVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    /**
     * Retrieves the ticket expiry date of the visitor.
     *
     * @return The ticket expiry date.
     */
    public String getTicketExpiry() {
        return ticketExpiry;
    }

    /**
     * Sets the ticket expiry date for the visitor.
     *
     * @param ticketExpiry The ticket expiry date to set.
     */
    public void setTicketExpiry(String ticketExpiry) {
        this.ticketExpiry = ticketExpiry;
    }
}
