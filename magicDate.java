import java.time.LocalDateTime;     // Needed for date-time.
import java.time.format.DateTimeFormatter; // Needed for formatting date-time
import javax.swing.JOptionPane;
public class CapStone
{
    public static void main(String[] args)
    {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("CapStone Project: " + formattedDateTime);
        System.out.println("Programmer: " + System.getProperty("user.name"));

        int month, day, year;
        String user;

        String userString = JOptionPane.showInputDialog("What is your name?");
        user = new String(userString);

        String monthString = JOptionPane.showInputDialog("Enter a number for a month.");
        month = Integer.parseInt(monthString);

        String dayString = JOptionPane.showInputDialog("Enter a number for a day.");
        day = Integer.parseInt(dayString);

        String yearString = JOptionPane.showInputDialog("Enter a two-digit number for a year.");
        year = Integer.parseInt(yearString);

        int magicDate = month * day;

        if(magicDate == year) {
            JOptionPane.showMessageDialog(null, user + ", that date is magic!");
        } else {
            JOptionPane.showMessageDialog(null, user + ", sorry that's just a regular date..." +
                    "not magic.");
        }


    }
}
