import java.util.Scanner;

public class Date implements java.io.Serializable{
    private String month;
    private int day;
    private int year;

    Date(){
        this.month = "";
        this.day = 1;
        this.year = 1000;
    }

    Date(String monthString, int day, int year){
        setDate(monthString, day, year);
    }

    Date(Date aDate){
        if(aDate == null){
            System.out.println("Fatal Error.");
            System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    void setDate(int monthInt, int day, int year){
        if(dateOK(monthInt, day, year)){
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }else{
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
       return month+" "+day+", "+year;
    }

    void setDate(String monthString, int day, int year){
        if(dateOK(monthString, day, year)){
            this.month = monthString;
            this.day = day;
            this.year = year;
        }else{
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    void setDate(int year){
        setDate(1, 1, year);
    }

    void readInput(){
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while(tryAgain){
            System.out.println("Enter month, day, and year without using commas.");
            String monthInput = keyboard.next();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if(dateOK(monthInput, dayInput, yearInput)){
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }else{
                System.out.println("Illegal date. Reenter input.");
            }
        }
    }

    boolean precedes(Date otherDate){
        return ( (year<otherDate.year) ||
                 (year==otherDate.year && getMonth()<otherDate.getMonth()) ||
                 (year==otherDate.year && month.equals(otherDate.month)    && day<otherDate.day));
    }


    private boolean dateOK(int monthInt, int dayInt, int yearInt){
        return( (monthInt>=1)   && (monthInt<=12)  &&
                (dayInt>=1)     && (dayInt<=31)    &&
                (yearInt>=1000) && (yearInt<=9999) );
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt){
        return ( (monthOK(monthString))              &&
                 (dayInt>=1)      && (dayInt<=31)    &&
                 (yearInt >=1000) && (yearInt<=9999) );
    }

    private String monthString(int monthNumber){
        switch (monthNumber){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }

    private int getMonth(){
        if(month.equalsIgnoreCase("January"))
            return 1;
        else if(month.equalsIgnoreCase("February"))
            return 2;
        else if(month.equalsIgnoreCase("March"))
            return 3;
        else if(month.equalsIgnoreCase("April"))
            return 4;
        else if(month.equalsIgnoreCase("May"))
            return 5;
        else if(month.equalsIgnoreCase("June"))
            return 6;
        else if(month.equalsIgnoreCase("July"))
            return 7;
        else if(month.equalsIgnoreCase("August"))
            return 8;
        else if(month.equalsIgnoreCase("September"))
            return 9;
        else if(month.equalsIgnoreCase("October"))
            return 10;
        else if(month.equalsIgnoreCase("November"))
            return 11;
        else if(month.equalsIgnoreCase("December"))
            return 12;
        else{
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }

    private boolean monthOK(String month){
        return ( month.equalsIgnoreCase("January")   ||
                 month.equalsIgnoreCase("February")  ||
                 month.equalsIgnoreCase("March")     ||
                 month.equalsIgnoreCase("April")     ||
                 month.equalsIgnoreCase("May")       ||
                 month.equalsIgnoreCase("June")      ||
                 month.equalsIgnoreCase("July")      ||
                 month.equalsIgnoreCase("August")    ||
                 month.equalsIgnoreCase("September") ||
                 month.equalsIgnoreCase("October")   ||
                 month.equalsIgnoreCase("November")  ||
                 month.equalsIgnoreCase("December")  );
    }
}