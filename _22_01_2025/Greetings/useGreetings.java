import java.time.*;
import java.util.Calendar;

class useGreetings{

    public static void main(String[] args) {
        Calendar DOB = Calendar.getInstance();
        Calendar currDate = Calendar.getInstance();

        
        DOB.set(Calendar.YEAR, 2006); 
        DOB.set(Calendar.MONTH, Calendar.JANUARY);
        DOB.set(Calendar.DAY_OF_MONTH, 6);

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        int currHour = istTime.getHour();

        greetings p1 = new greetings("Coonani", DOB);

        p1.greetPerson(currHour);
        p1.birthdayGreeting(currDate); 
        p1.calculateAge(currDate);
    }
}