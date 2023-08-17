import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class Age_Calculator_in_java {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.print("                        ");
        System.out.println("Steven's Age Calculator");
        System.out.println("");
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("What is your birthmonth " + name + "?");
        System.out.println("");
        System.out.println("[1] January");
        System.out.println("[2] February");
        System.out.println("[3] March");
        System.out.println("[4] April");
        System.out.println("[5] May");
        System.out.println("[6] June");
        System.out.println("[7] July");
        System.out.println("[8] August");
        System.out.println("[9] September");
        System.out.println("[10] October");
        System.out.println("[11] November");
        System.out.println("[12] December");
        int month = scan.nextInt();

        switch (month) {
            case 1:
                System.out.println("");
                System.out.println("So your Birthmonth is January! How about your Birthday?");
                int day = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int year = scan.nextInt();

                LocalDate currentDate = LocalDate.now();
                Month currentMonth = currentDate.getMonth();

                int monthValue = currentMonth.getValue();
                int dayOfMonth = currentDate.getDayOfMonth();

                int yeartoday = 2023;
                int yeardays = 365;
                int totaldaysinmonth = 30;

                int age = yeartoday - year;

                int agemonth = (yeartoday - year) * monthValue - month;

                int agedays = (yeartoday - year) * yeardays + (monthValue - month) * totaldaysinmonth
                        + (dayOfMonth - day);

                System.out.println("Your age is " + age + " and you've been here for " + agemonth + " months and "
                        + agedays + " days since the day you were born");

                break;
            case 2:
                System.out.println("");
                System.out.println("So your Birthmonth is Feburary! How about your Birthday?");
                int secondday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int secondyear = scan.nextInt();

                LocalDate secondcurrentDate = LocalDate.now();
                Month secondcurrentMonth = secondcurrentDate.getMonth();

                int secondmonthValue = secondcurrentMonth.getValue();
                int seconddayOfMonth = secondcurrentDate.getDayOfMonth();

                int secondyeartoday = 2023;
                int secondyeardays = 365;
                int secondtotaldaysinmonth = 30;

                int secondage = secondyeartoday - secondyear;

                int secondagemonth = (secondyeartoday - secondyear) * secondmonthValue - month;

                int secondagedays = (secondyeartoday - secondyear) * secondyeardays
                        + (secondmonthValue - month) * secondtotaldaysinmonth
                        + (seconddayOfMonth - secondday);

                System.out.println(
                        "Your age is " + secondage + " and you've been here for " + secondagemonth + " months and "
                                + secondagedays + " days since the day you were born");

                break;
        }

    }
}
