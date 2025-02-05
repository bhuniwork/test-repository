//
// Name: Ho, Brandon
// Project: 6
// Due: 12-6-24
// Course: cs-1400-02-f24
//
// Description:
//  Creates the "Pear" company with a few employees, and displays their ID number or join date.
//

public class CompanyApp
{
    public static void main(String[] args) {
        Employee[] pear = new Employee[8];

        //hi hi

        // Valid
        pear[0] = new EmployeeId("Jeve Stobs", "001-A", "04-01-76");
        pear[1] = new Date("Weve Stozniak", "002-A", "04-01-76");
        pear[2] = new EmployeeId("Wonald Rayne", "001-B", "04-01-76");

        // Invalid

        // wrong ID number format
        pear[3] = new EmployeeId("Super Secret 4th Guy", "420-Z23qwerty", "04-01-79");

        // 2-29-77 not valid because 1977 is not a leap year
        pear[4] = new Date("Super Secret 5th Guy who joined later", "420-Z", "02-29-77");

        // February has 28 days in 77, less than 41
        pear[5] = new Date("some contracted janitor", "420-Z", "02-41-77");

        // There is no 13th month
        pear[6] = new Date("the lawn mower guy", "420-Z", "13-41-77");

        // There is no 0th month
        pear[7] = new Date("the painter dude", "420-Z", "00-41-77");

        System.out.println();
        System.out.println("My Company by Brandon Ho");
        System.out.println();

        for(int i = 0; i < pear.length; i++) {
            System.out.println(pear[i].toString());
        } 
    }
}