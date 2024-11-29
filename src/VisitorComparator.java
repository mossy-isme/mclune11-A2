/**
 *
 * @author mosscluney
 */


import java.util.Comparator;

/**
 * Comparator implementation to compare Visitor objects based on their name and date of birth.
 */
public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by name first
        int nameComparison = v1.getName().compareToIgnoreCase(v2.getName());
        if (nameComparison != 0) {
            return nameComparison; // Return result of name comparison if they are different
        }
        // If names are equal, compare by DOB
        return v1.getDOB().compareTo(v2.getDOB());
    }
}
