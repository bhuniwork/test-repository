public class Date extends Employee
{

    //Day month year
    
    public Date (String name, String number, String date) {
        super(name, number, date);
    }

    @Override
    public void setDate (String date) {
        try {
            if (isValid(date) && validDay(date)) {
                super.setDate(date);
            } else {
                throw new IllegalArgumentException();
            } 
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date inputted for " + getName() + "!");
        }
    }

    public boolean isValid(String date) {
        return date.length() == 8 && Character.isDigit(date.charAt(0)) && Character.isDigit(date.charAt(1)) && date.charAt(2) == '-' && Character.isDigit(date.charAt(3)) && Character.isDigit(date.charAt(4)) && date.charAt(5) == '-' && Character.isDigit(date.charAt(6)) && Character.isDigit(date.charAt(7));
    }

    public static boolean validDay (String date)
    {
        int month = Integer.parseInt(date.substring(0, 2)); 
        int day = Integer.parseInt(date.substring(3, 5)); 
        int year = Integer.parseInt(date.substring(6, 8)); 

        if (getDayOfTheWeek(date) > getDayOfTheWeek(date) || (month == 2 && day == 29 && year % 4 == 0) || day <= 0 || day > getDayOfTheWeek(date)) {
            return false;
        } else {
            return true;
        }
    }

    public static int getDayOfTheWeek (String date)
    {
        int month = Integer.parseInt(date.substring(0, 2)); 
        int day = Integer.parseInt(date.substring(3, 5)); 
        int year = Integer.parseInt(date.substring(6, 8)); 

        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + (y / 4) - (y / 100) + (y / 400) + ((31 * m) / 12)) % 7;  
        return d;
    }

    public static boolean isLeapYear (String date)
    {
        int year = Integer.parseInt(date.substring(6, 8)); 

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getNumberOfDaysInMonth (String date)
    {
        int month = Integer.parseInt(date.substring(0, 2)); 

        switch(month) 
        {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2: 
                return isLeapYear(date) ? 29 : 28;
            default: 
                return 30;
        }
    }

    @Override
    public String toString () {
        return getName() + "'s join date is " + getDate();
    }
}