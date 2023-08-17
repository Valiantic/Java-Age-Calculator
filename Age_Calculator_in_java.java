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
            case 3:
                System.out.println("");
                System.out.println("So your Birthmonth is March! How about your Birthday?");
                int thirdday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int thirdyear = scan.nextInt();

                LocalDate thirdcurrentDate = LocalDate.now();
                Month thirdcurrentMonth = thirdcurrentDate.getMonth();

                int thirdmonthValue = thirdcurrentMonth.getValue();
                int thirddayOfMonth = thirdcurrentDate.getDayOfMonth();

                int thirdyeartoday = 2023;
                int thirdyeardays = 365;
                int thirdtotaldaysinmonth = 30;

                int thirdage = thirdyeartoday - thirdyear;

                int thirdagemonth = (thirdyeartoday - thirdyear) * thirdmonthValue - month;

                int thirdagedays = (thirdyeartoday - thirdyear) * thirdyeardays
                        + (thirdmonthValue - month) * thirdtotaldaysinmonth
                        + (thirddayOfMonth - thirdday);

                System.out.println(
                        "Your age is " + thirdage + " and you've been here for " + thirdagemonth + " months and "
                                + thirdagedays + " days since the day you were born");
                break;

            case 4:
                System.out.println("");
                System.out.println("So your Birthmonth is April! How about your Birthday?");
                int fourthday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int fourthyear = scan.nextInt();

                LocalDate fourthcurrentDate = LocalDate.now();
                Month fourthcurrentMonth = fourthcurrentDate.getMonth();

                int fourthmonthValue = fourthcurrentMonth.getValue();
                int fourthdayOfMonth = fourthcurrentDate.getDayOfMonth();

                int fourthyeartoday = 2023;
                int fourthyeardays = 365;
                int fourthtotaldaysinmonth = 30;

                int fourthage = fourthyeartoday - fourthyear;

                int fourthagemonth = (fourthyeartoday - fourthyear) * fourthmonthValue - month;

                int fourthagedays = (fourthyeartoday - fourthyear) * fourthyeardays
                        + (fourthmonthValue - month) * fourthtotaldaysinmonth
                        + (fourthdayOfMonth - fourthday);

                System.out.println(
                        "Your age is " + fourthage + " and you've been here for " + fourthagemonth + " months and "
                                + fourthagedays + " days since the day you were born");
                break;
            case 5:
                System.out.println("");
                System.out.println("So your Birthmonth is May! How about your Birthday?");
                int fifthday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int fifthyear = scan.nextInt();

                LocalDate fifthcurrentDate = LocalDate.now();
                Month fifthcurrentMonth = fifthcurrentDate.getMonth();

                int fifthmonthValue = fifthcurrentMonth.getValue();
                int fifthdayOfMonth = fifthcurrentDate.getDayOfMonth();

                int fifthyeartoday = 2023;
                int fifthyeardays = 365;
                int fifthtotaldaysinmonth = 30;

                int fifthage = fifthyeartoday - fifthyear;

                int fifthagemonth = (fifthyeartoday - fifthyear) * fifthmonthValue - month;

                int fifthagedays = (fifthyeartoday - fifthyear) * fifthyeardays
                        + (fifthmonthValue - month) * fifthtotaldaysinmonth
                        + (fifthdayOfMonth - fifthday);

                System.out.println(
                        "Your age is " + fifthage + " and you've been here for " + fifthagemonth + " months and "
                                + fifthagedays + " days since the day you were born");
                break;
            case 6:
                System.out.println("");
                System.out.println("So your Birthmonth is June! How about your Birthday?");
                int sixday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int sixyear = scan.nextInt();

                LocalDate sixcurrentDate = LocalDate.now();
                Month sixcurrentMonth = sixcurrentDate.getMonth();

                int sixmonthValue = sixcurrentMonth.getValue();
                int sixdayOfMonth = sixcurrentDate.getDayOfMonth();

                int sixyeartoday = 2023;
                int sixyeardays = 365;
                int sixtotaldaysinmonth = 30;

                int sixage = sixyeartoday - sixyear;

                int sixagemonth = (sixyeartoday - sixyear) * sixmonthValue - month;

                int sixagedays = (sixyeartoday - sixyear) * sixyeardays
                        + (sixmonthValue - month) * sixtotaldaysinmonth
                        + (sixdayOfMonth - sixday);

                System.out.println(
                        "Your age is " + sixage + " and you've been here for " + sixagemonth + " months and "
                                + sixagedays + " days since the day you were born");
                break;
            case 7:
                System.out.println("");
                System.out.println("So your Birthmonth is July! How about your Birthday?");
                int sevenday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int sevenyear = scan.nextInt();

                LocalDate sevencurrentDate = LocalDate.now();
                Month sevencurrentMonth = sevencurrentDate.getMonth();

                int sevenmonthValue = sevencurrentMonth.getValue();
                int sevendayOfMonth = sevencurrentDate.getDayOfMonth();

                int sevenyeartoday = 2023;
                int sevenyeardays = 365;
                int seventotaldaysinmonth = 30;

                int sevenage = sevenyeartoday - sevenyear;

                int sevenagemonth = (sevenyeartoday - sevenyear) * sevenmonthValue - month;

                int sevenagedays = (sevenyeartoday - sevenyear) * sevenyeardays
                        + (sevenmonthValue - month) * seventotaldaysinmonth
                        + (sevendayOfMonth - sevenday);

                System.out.println(
                        "Your age is " + sevenage + " and you've been here for " + sevenagemonth + " months and "
                                + sevenagedays + " days since the day you were born");
                break;
            case 8:
                System.out.println("");
                System.out.println("So your Birthmonth is August! How about your Birthday?");
                int eightday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int eightyear = scan.nextInt();

                LocalDate eightcurrentDate = LocalDate.now();
                Month eightcurrentMonth = eightcurrentDate.getMonth();

                int eightmonthValue = eightcurrentMonth.getValue();
                int eightdayOfMonth = eightcurrentDate.getDayOfMonth();

                int eightyeartoday = 2023;
                int eightyeardays = 365;
                int eighttotaldaysinmonth = 30;

                int eightage = eightyeartoday - eightyear;

                int eightagemonth = (eightyeartoday - eightyear) * eightmonthValue - month;

                int eightagedays = (eightyeartoday - eightyear) * eightyeardays
                        + (eightmonthValue - month) * eighttotaldaysinmonth
                        + (eightdayOfMonth - eightday);

                System.out.println(
                        "Your age is " + eightage + " and you've been here for " + eightagemonth + " months and "
                                + eightagedays + " days since the day you were born");
                break;
            case 9:
                System.out.println("");
                System.out.println("So your Birthmonth is September! How about your Birthday?");
                int nineday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int nineyear = scan.nextInt();

                LocalDate ninecurrentDate = LocalDate.now();
                Month ninecurrentMonth = ninecurrentDate.getMonth();

                int ninemonthValue = ninecurrentMonth.getValue();
                int ninedayOfMonth = ninecurrentDate.getDayOfMonth();

                int nineyeartoday = 2023;
                int nineyeardays = 365;
                int ninetotaldaysinmonth = 30;

                int nineage = nineyeartoday - nineyear;

                int nineagemonth = (nineyeartoday - nineyear) * ninemonthValue - month;

                int nineagedays = (nineyeartoday - nineyear) * nineyeardays
                        + (ninemonthValue - month) * ninetotaldaysinmonth
                        + (ninedayOfMonth - nineday);

                System.out.println(
                        "Your age is " + nineage + " and you've been here for " + nineagemonth + " months and "
                                + nineagedays + " days since the day you were born");
                break;
            case 10:
                System.out.println("");
                System.out.println("So your Birthmonth is October! How about your Birthday?");
                int tenday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int tenyear = scan.nextInt();

                LocalDate tencurrentDate = LocalDate.now();
                Month tencurrentMonth = tencurrentDate.getMonth();

                int tenmonthValue = tencurrentMonth.getValue();
                int tendayOfMonth = tencurrentDate.getDayOfMonth();

                int tenyeartoday = 2023;
                int tenyeardays = 365;
                int tentotaldaysinmonth = 30;

                int tenage = tenyeartoday - tenyear;

                int tenagemonth = (tenyeartoday - tenyear) * tenmonthValue - month;

                int tenagedays = (tenyeartoday - tenyear) * tenyeardays
                        + (tenmonthValue - month) * tentotaldaysinmonth
                        + (tendayOfMonth - tenday);

                System.out.println(
                        "Your age is " + tenage + " and you've been here for " + tenagemonth + " months and "
                                + tenagedays + " days since the day you were born");
                break;
            case 11:
                System.out.println("");
                System.out.println("So your Birthmonth is November! How about your Birthday?");
                int elevenday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int elevenyear = scan.nextInt();

                LocalDate elevencurrentDate = LocalDate.now();
                Month elevencurrentMonth = elevencurrentDate.getMonth();

                int elevenmonthValue = elevencurrentMonth.getValue();
                int elevendayOfMonth = elevencurrentDate.getDayOfMonth();

                int elevenyeartoday = 2023;
                int elevenyeardays = 365;
                int eleventotaldaysinmonth = 30;

                int elevenage = elevenyeartoday - elevenyear;

                int elevenagemonth = (elevenyeartoday - elevenyear) * elevenmonthValue - month;

                int elevenagedays = (elevenyeartoday - elevenyear) * elevenyeardays
                        + (elevenmonthValue - month) * eleventotaldaysinmonth
                        + (elevendayOfMonth - elevenday);

                System.out.println(
                        "Your age is " + elevenage + " and you've been here for " + elevenagemonth + " months and "
                                + elevenagedays + " days since the day you were born");
                break;
            case 12:
                System.out.println("");
                System.out.println("So your Birthmonth is December! How about your Birthday?");
                int twelveday = scan.nextInt();
                System.out.println("");
                System.out.println("Your Birthyear?");
                int twelveyear = scan.nextInt();

                LocalDate twelvecurrentDate = LocalDate.now();
                Month twelvecurrentMonth = twelvecurrentDate.getMonth();

                int twelvemonthValue = twelvecurrentMonth.getValue();
                int twelvedayOfMonth = twelvecurrentDate.getDayOfMonth();

                int twelveyeartoday = 2023;
                int twelveyeardays = 365;
                int twelvetotaldaysinmonth = 30;

                int twelveage = twelveyeartoday - twelveyear;

                int twelveagemonth = (twelveyeartoday - twelveyear) * twelvemonthValue - month;

                int twelveagedays = (twelveyeartoday - twelveyear) * twelveyeardays
                        + (twelvemonthValue - month) * twelvetotaldaysinmonth
                        + (twelvedayOfMonth - twelveday);

                System.out.println(
                        "Your age is " + twelveage + " and you've been here for " + twelveagemonth + " months and "
                                + twelveagedays + " days since the day you were born");
                break;
            default:
                System.out.print("Invalid Input");
                System.exit(0);
                break;
        }

    }
}
