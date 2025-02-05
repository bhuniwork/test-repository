public class EmployeeId extends Employee
{
    public EmployeeId (String name, String number, String date) {
        super(name, number, date);
    }

    @Override
    public void setNumber (String number) {
        try {
            if (isValid(number)) {
                super.setNumber(number);
            } else {
                throw new IllegalArgumentException();         
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID number inputted for " + getName() + "!");
        }
    }

    public boolean isValid(String number) {
        return number.length() == 5 && Character.isDigit(number.charAt(0)) && Character.isDigit(number.charAt(1)) && Character.isDigit(number.charAt(2)) && number.charAt(3) == '-' && number.charAt(4) >= 'A' && number.charAt(4) <= 'M';
    }

    @Override
    public String toString () {
            return getName() + "'s ID number is " + getNumber();
    }
}