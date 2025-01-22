import java.time.*;
import java.util.Calendar;

public class greetings{
    String Name;
    Calendar DOB;

    public  greetings(String name, Calendar dob){
        Name = name;
        DOB = (Calendar) dob.clone();
    }

    public void greetPerson(int hour){
        if (hour >= 5 && hour < 12) System.out.println("Good Morning " + this.Name + " !!");
        else if (hour >= 12 && hour < 16) System.out.println("Good Afternoon " + this.Name + " !!");
        else if (hour >= 16 && hour < 19) System.out.println("Good Evening " + this.Name + " !!");
        else System.out.println("Good Night " + this.Name + " !!");
    }

    public void birthdayGreeting(Calendar currDate){
        int compare = this.DOB.compareTo(currDate);

        if(compare > 0) System.out.println("Advance Happy Birthday " + this.Name + " !!");
        else if(compare < 0) System.out.println("Belated Happy Birthday " + this.Name + " !!");
        else System.out.println("Happy Birthday " + this.Name + " !!"); 
    }

    public void calculateAge(Calendar currDate){
        LocalDate birthDate = LocalDate.of(
                this.DOB.get(Calendar.YEAR),
                this.DOB.get(Calendar.MONTH) + 1, // Months are 0-indexed in Calendar
                this.DOB.get(Calendar.DAY_OF_MONTH)
        );

        // Get current date
        LocalDate currentDate = LocalDate.of(
            currDate.get(Calendar.YEAR),
            currDate.get(Calendar.MONTH) + 1, // Months are 0-indexed in Calendar
            currDate.get(Calendar.DAY_OF_MONTH)
    );

        // Calculate age using Period class
        Period age = Period.between(birthDate, currentDate);

        // Extract age in years
        int years = age.getYears();
        int month = age.getMonths();
        int day = age.getDays();

        System.out.printf("You are %d years, %d months, %d days old !!", years, month, day);   
    }
}