import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {
        String inputTime = "07:45:30 PM";
        
        try {
            String militaryTime = convertToMilitaryTime(inputTime);
            System.out.println("Military Time: " + militaryTime);
        } catch (ParseException e) {
            System.out.println("Error parsing the input time.");
            e.printStackTrace();
        }
    }

    private static String convertToMilitaryTime(String inputTime) throws ParseException {
        // Create a SimpleDateFormat object for parsing the input time
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");

        // Parse the input time string to obtain a Date object
        Date date = inputFormat.parse(inputTime);

        // Create a SimpleDateFormat object for formatting the military time
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        // Format the Date object to obtain the military time string
        return outputFormat.format(date);
    }
}
