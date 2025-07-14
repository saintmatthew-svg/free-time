import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class MenstrualApp {
    private LocalDate startDate;
    private int cycleDays;
    private int periodDays;

    public MenstrualApp(String startDateStr, int cycleDays, int periodDays) {
        this.startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        this.cycleDays = cycleDays;
        this.periodDays = periodDays;
    }

    public LocalDate getNextPeriod() {
        return startDate.plusDays(cycleDays);
    }

    public LocalDate getOvulation() {
        return startDate.plusDays(cycleDays / 2);
    }

    public LocalDate getFertileStart() {
        LocalDate ovulation = getOvulation();
        return ovulation.minusDays(2);
    }

    public LocalDate getFertileEnd() {
        LocalDate ovulation = getOvulation();
        return ovulation.plusDays(2);
    }

    public LocalDate getSafeEndBeforeFertile() {
        return getFertileStart().minusDays(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your simple Menstrual App!");

        System.out.print("Enter your last period date (yyyy-mm-dd): ");
        String date = scanner.nextLine();

        System.out.print("How many days is your cycle? : ");
        int cycleDays = scanner.nextInt();

        System.out.print("How many days does your period last? : ");
        int periodDays = scanner.nextInt();

        MenstrualApp cycle = new MenstrualApp(date, cycleDays, periodDays);

        LocalDate nextPeriod = cycle.getNextPeriod();
        LocalDate ovulation = cycle.getOvulation();
        LocalDate fertileStart = cycle.getFertileStart();
        LocalDate fertileEnd = cycle.getFertileEnd();
        LocalDate safeEndBeforeFertile = cycle.getSafeEndBeforeFertile();
	System.out.println();

        System.out.println("Here are your period details:");
        System.out.println("Last Period Started: " + date);
        System.out.println("Next Period Starts: " + nextPeriod);
        System.out.println("Ovulation Day: " + ovulation);
        System.out.println("Fertile Days: " + fertileStart + " to " + fertileEnd);
        System.out.println("Safe Days Before Fertile: " + cycle.startDate.plusDays(periodDays) + " to " + safeEndBeforeFertile);
        System.out.println("Safe Days After Fertile: " + fertileEnd.plusDays(1) + " to " + nextPeriod.minusDays(1));
        System.out.println("(Note: Safe days are not 100% sure, be careful oh!)");

    }

}