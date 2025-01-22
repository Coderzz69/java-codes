import java.time.*;

public class greetings {
    String name;
    LocalDate dob;

    public greetings(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public void greetPerson(int hour) {
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning " + this.name + " !!");
        } else if (hour >= 12 && hour < 16) {
            System.out.println("Good Afternoon " + this.name + " !!");
        } else if (hour >= 16 && hour < 19) {
            System.out.println("Good Evening " + this.name + " !!");
        } else {
            System.out.println("Good Night " + this.name + " !!");
        }
    }

    public void birthdayGreeting(LocalDate currDate) {
        if (currDate.getMonth() == dob.getMonth() && currDate.getDayOfMonth() == dob.getDayOfMonth()) {
            System.out.println("Happy Birthday " + this.name + " !!");
        } else if (currDate.getMonthValue() > dob.getMonthValue() || (currDate.getMonthValue() == dob.getMonthValue() && currDate.getDayOfMonth() > dob.getDayOfMonth())) {
            System.out.println("Belated Happy Birthday " + this.name + " !!");
        }else if (currDate.getMonthValue() < dob.getMonthValue() || (currDate.getMonthValue() == dob.getMonthValue() && currDate.getDayOfMonth() < dob.getDayOfMonth())) {
                    System.out.println("Advance Happy Birthday " + this.name + " !!");
        }
    }

    public void calculateAge(LocalDate currDate) {
        Period age = Period.between(dob, currDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        System.out.printf("You are %d years, %d months, %d days old !!", years, months, days);
    }
}