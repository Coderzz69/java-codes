import java.time.*;
import java.util.Scanner;

class useGreetings {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your year of birth (YYYY): ");
            int year = scanner.nextInt();
            
            System.out.print("Enter your month of birth (1-12): ");
            int month = scanner.nextInt();
            
            System.out.print("Enter your day of birth (1-31): ");
            int day = scanner.nextInt();
            
            LocalDate dob = LocalDate.of(year, month, day);
            LocalDate currDate = LocalDate.now();
            
            LocalDateTime localTime = LocalDateTime.now();
            int currHour = localTime.getHour();

            greetings p1 = new greetings(name, dob);

            System.out.println("Date of Birth: " + dob);
            System.out.println("Current Date: " + currDate);

            p1.greetPerson(currHour);
            p1.birthdayGreeting(currDate);
            p1.calculateAge(currDate);
        }
    }
}